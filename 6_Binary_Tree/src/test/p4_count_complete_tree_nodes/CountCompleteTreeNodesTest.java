package p4_count_complete_tree_nodes;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class CountCompleteTreeNodesTest {

    @Test
    void countNodes() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        assertThat(new CountCompleteTreeNodes().countNodes(root)).isEqualTo(6);
    }
}