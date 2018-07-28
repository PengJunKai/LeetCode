package sortedArrayToBST;

/**
 * Created by PengJK on 2018/7/28.
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of
 * the two subtrees of every node never differ by more than 1.
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return getTree(nums, 0, nums.length - 1);
    }

    public TreeNode getTree(int[] nums, int l, int r) {
        if (l <= r) {
            int mid = (l + r) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = getTree(nums, l, mid - 1);
            node.right = getTree(nums, mid + 1, r);
            return node;
        }
        return null;
    }
}

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

