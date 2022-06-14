package p3_binary_tree_right_side_view;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class BinaryTreeRightSideViewTest {

    @Test
    void rightSideView() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(6);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(7);
        root.left.left.right.left = new TreeNode(8);
        root.left.right = new TreeNode(3);
        assertThat(new BinaryTreeRightSideView().rightSideView(root)).isEqualTo(List.of(1,3,6,7,8));
    }
}