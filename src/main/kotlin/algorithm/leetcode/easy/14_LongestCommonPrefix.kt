package algorithm.leetcode.easy

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    if (strs.size == 1) return strs[0]

    strs.sortBy { it.length }

    val standard = strs[0]
    var result = ""

    standard.forEachIndexed { index, c ->
        for (i in 1 until strs.size) {
            if (strs[i][index] != c) {
                return result
            }
        }
        result += c
    }

    return result
}
