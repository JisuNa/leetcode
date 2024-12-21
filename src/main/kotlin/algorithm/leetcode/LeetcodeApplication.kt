package algorithm.leetcode

import algorithm.leetcode.easy.TreeNode
import algorithm.leetcode.easy.binaryTreeInorderTraversal

fun main() {
    val tree = TreeNode(1).also {
        it.left = TreeNode(2)
        it.right = TreeNode(3)
    }
    println(binaryTreeInorderTraversal(tree))
}
