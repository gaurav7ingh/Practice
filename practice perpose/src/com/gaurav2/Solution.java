package com.gaurav2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
	List<List<Integer>> ans = new ArrayList<>();

	public List<Integer> kdistance(TreeNode root, int k) {
		find(root);
		return ans.get(k);
	}

	public List<List<Integer>> find(TreeNode root) {
		if (root == null)
			return ans;

		List<Integer> list = new ArrayList<>();
		Queue<TreeNode> que = new LinkedList<>();

		que.add(root);
		que.add(null);

		while (!que.isEmpty()) {
			TreeNode node = que.poll();
			if (node != null) {
				list.add(node.data);
				if (node.left != null)
					que.add(node.left);
				if (node.right != null)
					que.add(node.right);
			} else if (!que.isEmpty()) {
				que.add(null);
				ans.add(list);
				list = new ArrayList<>();
			} else {
				ans.add(list);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		tree.left.left = new TreeNode(4);
		tree.left.right = new TreeNode(5);
		tree.right.left = new TreeNode(6);
		tree.right.right = new TreeNode(7);

		Solution solution = new Solution();
		List<Integer> list = solution.kdistance(tree, 2);
		list.forEach(s -> System.out.println(s));
	}
}
