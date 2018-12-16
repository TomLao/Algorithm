package LeetCode_Java;

import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

public class Check_Completeness_of_a_Binary_Tree_958 {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null)
            return false;
        boolean isLeaf = false;
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        while (!list.isEmpty()) {
            TreeNode node = list.pop();
            if (isLeaf && (node.left != null || node.right != null))
                return false;
            if (node.left == null && node.right != null)    //右子树不为空
                return false;
            if (node.left != null)
                list.add((node.left));
            if (node.right != null)
                list.add(node.right);
            else
                isLeaf = true;
        }
        return true;
    }
}
