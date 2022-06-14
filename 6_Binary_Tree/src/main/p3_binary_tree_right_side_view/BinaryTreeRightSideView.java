package p3_binary_tree_right_side_view;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-right-side-view/
 */
public class BinaryTreeRightSideView { // Time complexity is O(n) and space complexity is O(n)
    public List<Integer> rightSideView(TreeNode node) {
        List<Integer> result = new ArrayList<>();
        dfs(node, 0, result);
        return result;
    }

    private void dfs(TreeNode node, int currentLevel, List<Integer> result) {
        if (node != null) {
            if (currentLevel >= result.size()) {
                result.add(node.value);
            }
            if (node.right != null) {
                dfs(node.right, currentLevel + 1, result);
            }
            if (node.left != null) {
                dfs(node.left, currentLevel + 1, result);
            }
        }
    }
}
