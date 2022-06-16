package p5_validate_binary_search_tree;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
class ValidateBinarySearchTreeTest {

    @Test
    void isValidBST() {
        TreeNode root1 = new TreeNode(12);
        root1.left = new TreeNode(7);
        root1.left.left = new TreeNode(5);
        root1.left.right = new TreeNode(9);
        root1.right = new TreeNode(18);
        root1.right.left = new TreeNode(16);
        root1.right.right = new TreeNode(25);

        assertThat(new ValidateBinarySearchTree().isValidBST(root1)).isTrue();

        TreeNode root2 = new TreeNode(12);
        root2.left = new TreeNode(15);
        root2.right = new TreeNode(17);

        assertThat(new ValidateBinarySearchTree().isValidBST(root2)).isFalse();

        TreeNode root3 = new TreeNode(13);
        root3.left = new TreeNode(9);
        root3.right = new TreeNode(10);

        assertThat(new ValidateBinarySearchTree().isValidBST(root3)).isFalse();

        TreeNode root4 = new TreeNode(15);
        root4.left = new TreeNode(12);
        root4.left.left = new TreeNode(10);
        root4.left.right = new TreeNode(16);
        root4.right = new TreeNode(17);
        root4.right.left = new TreeNode(16);
        root4.right.right = new TreeNode(18);

        assertThat(new ValidateBinarySearchTree().isValidBST(root4)).isFalse();

        TreeNode root5 = new TreeNode(15);
        root5.left = new TreeNode(12);
        root5.left.left = new TreeNode(10);
        root5.left.right = new TreeNode(14);
        root5.right = new TreeNode(18);
        root5.right.left = new TreeNode(13);
        root5.right.right = new TreeNode(20);

        assertThat(new ValidateBinarySearchTree().isValidBST(root5)).isFalse();
    }
}