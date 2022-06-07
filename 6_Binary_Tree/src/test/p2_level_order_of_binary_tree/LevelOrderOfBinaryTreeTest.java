package p2_level_order_of_binary_tree;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class LevelOrderOfBinaryTreeTest {

    @Test
    void levelOrder() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> levelOrder = new ArrayList<>();
        levelOrder.add(List.of(3));
        levelOrder.add(List.of(9, 20));
        levelOrder.add(List.of(15, 7));
        assertThat(new LevelOrderOfBinaryTree().levelOrder(root)).isEqualTo(levelOrder);
    }
}