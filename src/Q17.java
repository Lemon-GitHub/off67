/*
 * 树的子结构
 * */

public class Q17 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.val == root2.val && isContain(root1, root2)) {
            return true;
        }

        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    public boolean isContain(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 != null) {
            return false;
        }
        if (node2 == null) {
            return true;
        }
        return node1.val == node2.val && isContain(node1.left, node2.left)
                && isContain(node1.right, node2.right);
    }
}
