SELECT ROUND(SUM(
    CASE WHEN order_date = customer_pref_delivery_date THEN 1
    ELSE 0 END)/COUNT(*) * 100, 2) AS immediate_percentage
FROM (
    SELECT *,
    ROW_NUMBER() OVER(PARTITION BY customer_id order by order_date) as rn
    FROM Delivery
) AS SQ
WHERE rn = 1
;


# Write your MySQL query statement below
# WITH fo AS (
#     SELECT delivery_id, customer_id,
#         MIN(order_date) OVER (PARTITION BY customer_id) as order_date,
#         customer_pref_delivery_date
#     FROM Delivery  
# )

# SELECT ROUND(100*COUNT ( CASE
#     WHEN order_date = customer_pref_delivery_date THEN 1
#     ELSE 0 END
#     )/ COUNT(cust), 2) as immediate_percentage
# FROM fo
# ;

# WITH fo AS (
#     SELECT delivery_id,
#            customer_id,
#            MIN(order_date) OVER (PARTITION BY customer_id) AS order_date,
#            customer_pref_delivery_date
#     FROM Delivery  
# )

# SELECT ROUND(100 * COUNT(CASE
#                               WHEN order_date = customer_pref_delivery_date THEN 1
#                               ELSE 0 
#                           END)
#              / COUNT(delivery_id), 2) AS immediate_percentage
# FROM fo;