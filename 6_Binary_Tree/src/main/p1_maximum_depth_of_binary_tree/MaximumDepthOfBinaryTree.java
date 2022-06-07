package p1_maximum_depth_of_binary_tree;

import util.TreeNode;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);
            return Math.max(lDepth + 1, rDepth + 1);
        }
    }

    public int maxDepth(TreeNode node, int currentDepth) {
        if (node == null) {
            return currentDepth;
        }
        currentDepth++;
        return Math.max(maxDepth(node.left, currentDepth), maxDepth(node.right, currentDepth));
    }
}
