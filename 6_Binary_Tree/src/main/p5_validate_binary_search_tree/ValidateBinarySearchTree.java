package p5_validate_binary_search_tree;

import util.TreeNode;

/**
 * https://leetcode.com/problems/validate-binary-search-tree/
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) { // T.C. = O(n), S.P = O(n)
        if (root == null) {
            return true;
        }
        return dfs(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    private boolean dfs(TreeNode node, double min, double max) {
        if (node.value <= min || node.value >= max) {
            return false;
        }
        if (node.left != null) {
            if (!dfs(node.left, min, node.value)) {
                return false;
            }
        }
        if (node.right != null) {
            if (!dfs(node.right, node.value, max)) {
                return false;
            }
        }
        return true;
    }
}
