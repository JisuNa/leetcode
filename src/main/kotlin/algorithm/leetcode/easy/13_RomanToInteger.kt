package algorithm.leetcode.easy

fun romanToInt(s: String): Int {
    val romanMap = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    val replace = s.replace("IV", "IIII")
        .replace("IX", "VIIII")
        .replace("XL", "XXXX")
        .replace("XC", "LXXXX")
        .replace("CD", "CCCC")
        .replace("CM", "DCCCC")

    var result = 0
    val split = replace.toCharArray()

    for (i in split.indices) {
        result += romanMap[split[i]] ?: 0
    }

    return result
}
