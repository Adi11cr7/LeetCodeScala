import scala.util.Sorting
object Solution {
    def removeElement(nums: Array[Int], `val`: Int): Int = {
        var k = 0
        var flag = false
        var valCount = 0
        var i = 0
        while(i < nums.length && nums(i) != `val`) i+=1
        // if(i<nums.length) valCount = 1
        for(j <-i until nums.length) {
            if(nums(j) != `val`) {
                // k=i
                nums(i) = nums(j)
                nums(j) = 51
                i += 1
                
            }
            else {
                valCount +=1 
            }
            
        }
        // println(nums)
        // println(k)
        // Sorting.quickSort(nums)
        nums.length-valCount
    }
}