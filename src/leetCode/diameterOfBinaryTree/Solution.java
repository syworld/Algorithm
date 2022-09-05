package leetCode.diameterOfBinaryTree;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */

/*
O(N)
 */

class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

public class Solution {

  int max;

  public int diameterOfBinaryTree(TreeNode root) {
    find(root);
    return max;
  }

  public int find(TreeNode node) {
    if (node == null) {
      return 0;
    }

    int leftMax = find(node.left);
    int rightMax = find(node.right);

    max = Math.max(max, leftMax + rightMax);
    return Math.max(leftMax, rightMax) + 1; // 나와 부모의 간선 하나 더해줌
  }
}