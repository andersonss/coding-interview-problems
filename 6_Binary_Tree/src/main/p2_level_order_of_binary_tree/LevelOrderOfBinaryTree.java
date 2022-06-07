package p2_level_order_of_binary_tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
public class LevelOrderOfBinaryTree {
    public List<List<Integer>> levelOrder(TreeNode root) { // Time complexity: O(n), Space complexity: O(n)
        List<List<Integer>> levelOrderTraversal = new ArrayList<>();
        if (root == null) {
            return levelOrderTraversal;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> levelValues = new ArrayList<>();
            Queue<TreeNode> nextLevelNodes = new LinkedList<>();
            while(!queue.isEmpty()) {
                TreeNode currentNode = queue.poll();
                levelValues.add(currentNode.val);
                if (currentNode.left != null) {
                    nextLevelNodes.add(currentNode.left);
                }
                if(currentNode.right != null) {
                    nextLevelNodes.add(currentNode.right);
                }
            }
            levelOrderTraversal.add(levelValues);
            queue = nextLevelNodes;
        }
        return levelOrderTraversal;
    }
}
