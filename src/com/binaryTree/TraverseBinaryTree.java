package com.binaryTree;

public class TraverseBinaryTree {

	public static void forEachLeft(BinaryTreeNode node) {
		if (node != null && node.left != null) {
			System.out.print("node.left = " + node.left.data);
			node.left = node.left.next;
		}
	}
	
	public static void forEachRight(BinaryTreeNode node) {
		if (node != null && node.right != null) {
			System.out.print("node.right = " + node.right.data);
			node.right = node.right.next;
		}
	}
	
	public static void forEachNode(BinaryTreeNode node) {
		if (node != null) {
			System.out.print(node.data + " ");
			forEachNode(node.left);
			forEachNode(node.right);
		}
	}
	
	public static void main(String[] args) {
		BinaryTreeNode binaryTreeNode = CreateBinaryTree.create();
		forEachNode(binaryTreeNode);
	}
	
}
