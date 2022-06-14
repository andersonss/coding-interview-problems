package p4_count_complete_tree_nodes;

import util.TreeNode;

/**
 * https://leetcode.com/problems/count-complete-tree-nodes/
 */
public class CountCompleteTreeNodes {
    // Return tree depth in O(height) time.
    public int computeDepth(TreeNode node) {
        int height = 0;
        while (node.left != null) {
            node = node.left;
            height++;
        }
        return height;
    }
    // Last level nodes are enumerated from 0 to 2**height - 1 (left -> right).
    // Return True if last level node idxToFind exists.
    // Binary search with O(height) complexity.
    public boolean exists(int idxToFind, int height, TreeNode node) {
        int left = 0, right = (int)Math.pow(2, height) - 1;
        int pivot;
        for(int i = 0; i < height; ++i) {
            pivot = left + (right - left) / 2;
            if (idxToFind <= pivot) {
                node = node.left;
                right = pivot;
            }
            else {
                node = node.right;
                left = pivot + 1;
            }
        }
        return node != null;
    }
    public int countNodes(TreeNode root) {
        // if the tree is empty
        if (root == null) return 0;
        int d = computeDepth(root);
        // if the tree contains 1 node
        if (d == 0) return 1;
        // Last level nodes are enumerated from 0 to 2**d - 1 (left -> right).
        // Perform binary search to check how many nodes exist.
        int upperCount = (int)Math.pow(2, d) - 1;
        int left = 1, right = upperCount;
        int pivot;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (exists(pivot, d, root)) left = pivot + 1;
            else right = pivot - 1;
        }
        // The tree contains 2**d - 1 nodes on the first (d - 1) levels
        // and left nodes on the last level.
        return upperCount + left;
    }
}
