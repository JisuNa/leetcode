package algorithm.leetcode.easy

fun preorderTraversal(root: TreeNode?): List<Int> {
    val result = mutableListOf<Int>()

    fun traverse(node: TreeNode?) {
        if (node == null) return

        result.add(node.`val`)
        traverse(node.left)
        traverse(node.right)
    }

    traverse(root)

    return result
}