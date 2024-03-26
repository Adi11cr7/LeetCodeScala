import scala.util.Sorting
object Solution {
    def removeElement(nums: Array[Int], `val`: Int): Int = {
        var k = 0
        for(i<-0 until nums.length) {
            if(nums(i) == `val`) {
                nums(i) = 51
                k += 1
            }
        }
        // println(nums)
        // println(k)
        Sorting.quickSort(nums)
        nums.length-k
    }
}