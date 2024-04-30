# Write your MySQL query statement below
SELECT ROUND(SUM(
    CASE WHEN DATEDIFF(event_date,first_event_date)=1 THEN 1
        ELSE 0 END)/COUNT(DISTINCT Activity.player_id), 2) AS fraction
FROM
        (SELECT player_id, MIN(event_date) AS first_event_date
        FROM Activity
        GROUP BY player_id) table1
        LEFT JOIN Activity
    ON Activity.player_id = table1.player_id
;