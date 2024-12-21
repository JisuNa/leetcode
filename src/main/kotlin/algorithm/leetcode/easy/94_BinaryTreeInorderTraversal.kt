package algorithm.leetcode.easy

fun binaryTreeInorderTraversal(root: TreeNode?): List<Int> {
    val result = mutableListOf<Int>()

    fun traverse(node: TreeNode?) {
        if (node == null) return

        traverse(node.left)
        result.add(node.`val`)
        traverse(node.right)
    }

    traverse(root)

    return result
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
