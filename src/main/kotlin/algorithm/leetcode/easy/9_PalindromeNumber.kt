package algorithm.leetcode.easy

/**
 * Problem: https://leetcode.com/problems/palindrome-number/description/
 *
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 *
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 */

fun isPalindrome(x: Int): Boolean {
    if (x < 0 || (x != 0 && x % 10 == 0)) return false

    var rev = 0
    var x = x

    while (x > rev) {
        rev = rev * 10 + x % 10
        x /= 10
    }

    return x == rev || x == rev / 10
}
