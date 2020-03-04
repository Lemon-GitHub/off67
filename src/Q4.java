/*
 * 重建二叉树
 * */

import java.util.Arrays;
public class Q4 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);

        // 在中序中找到树的根
        for (int i = 0; i < in.length; i++) {
            if (pre[0] == in[i]) {
                // 左子树  Arrays.copyOfRange 左闭右开区间
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
                // 右子树
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1, pre.length) );
                break;
            }
        }
        return root;
    }
}
