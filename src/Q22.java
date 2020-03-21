/*
 * 从上往下打印二叉树
 * */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Q22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        if (root == null) {
            return arr;
        }

        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            arr.add(cur.val);
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
        return arr;
    }
}
