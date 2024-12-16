package algorithm.leetcode.easy

fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty()) return 0
    if (s.length == 1) return 1

    val charIndexMap = mutableMapOf<Char, Int>()
    var left = 0
    var right = 0
    var max = 0

    while (right < s.length) {
        if (charIndexMap.containsKey(s[right]) && charIndexMap[s[right]]!! >= left) {
            left = charIndexMap[s[right]]!! + 1
        }
        charIndexMap[s[right]] = right
        max = maxOf(max, right - left + 1)

        right++
    }

    return max
}
