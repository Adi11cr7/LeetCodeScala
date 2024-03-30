object Solution {
    def mergeAlternately(word1: String, word2: String): String = {
        var stringBuilder = new StringBuilder(word1 + word2)
        var i = 0
        var j = 0
        var l = 0
        val m = word1.length
        val n = word2.length
        // val len = word1.length
        
        while(i<m && j<n) {
            stringBuilder(l) = word1(i)
            i += 1
            l += 1
            stringBuilder(l) = word2(j)
            j += 1
            l += 1
        }
        
        while(i<m) {
            stringBuilder(l) = word1(i)
            i += 1
            l += 1
        }
        while(j<n) {
            stringBuilder(l) = word2(j)
            j += 1
            l += 1
        }
        
        val modifiedStr = stringBuilder.toString()
        modifiedStr
    }
}