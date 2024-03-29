object Solution {
    def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
        
        var i = m-1
        var j = n-1
        var l = m+n-1
        println(s"m=$m  n=$n")
        // println("i  j   l")
        while(i>=0 && j>=0) {
            // println(s"$i $j  $l")
            if(nums1(i) >= nums2(j)) {
                nums1(l) = nums1(i)
                i -= 1
            }
            else {
                nums1(l) = nums2(j)
                j -= 1
            }
            l -= 1
        }
        
        while(j>=0) {
            nums1(l) = nums2(j)
            j -= 1
            l -= 1
        }
    }
}