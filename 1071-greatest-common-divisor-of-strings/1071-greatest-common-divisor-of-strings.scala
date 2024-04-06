object Solution {
    
    def valid(str1: String, str2: String, k: Integer): Boolean = {
        val len1 = str1.length
        val len2 = str2.length
        if(len1 % k > 0 || len2 % k >0) {
            false
        }
        else {
            val base = str1.substring(0,k)
            val n1 = len1 / k
            val n2 = len2 / k
            
            return str1==base*n1 && str2==base*n2
        }
    }
    
    def gcdOfStrings(str1: String, str2: String): String = {
        
        val len1 = str1.length
        val len2 = str2.length
        var i = math.min(len1, len2)
        var found = false
        var result = ""
        while (i >= 1 && !found) {
            if(valid(str1, str2, i)) {
                result = str1.substring(0,i)
                found = true
            }
            i -= 1
        }
        result
    }
}