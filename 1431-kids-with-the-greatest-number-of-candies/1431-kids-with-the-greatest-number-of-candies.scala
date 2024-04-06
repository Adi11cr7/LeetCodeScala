object Solution {
    def kidsWithCandies(candies: Array[Int], extraCandies: Int): List[Boolean] = {
        val maxCandy = candies.max
        
        val resultList = candies.map(num => num + extraCandies >= maxCandy)
        resultList.toList
    }
}