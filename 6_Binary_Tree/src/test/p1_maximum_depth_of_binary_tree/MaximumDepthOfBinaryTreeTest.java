package p1_maximum_depth_of_binary_tree;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class MaximumDepthOfBinaryTreeTest {

    @Test
    void maxDepth1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        assertThat(maximumDepthOfBinaryTree.maxDepth(root)).isEqualTo(3);
        assertThat(maximumDepthOfBinaryTree.maxDepth(root, 0)).isEqualTo(3);
    }
    @Test
    void maxDepth2() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        assertThat(maximumDepthOfBinaryTree.maxDepth(root)).isEqualTo(2);
        assertThat(maximumDepthOfBinaryTree.maxDepth(root, 0)).isEqualTo(2);
    }
}