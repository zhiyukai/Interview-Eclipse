package com.binaryTree;

public class CreateBinaryTree {

	private static int nodeData;

	public static BinaryTreeNode create() {

		BinaryTreeNode binaryTreeNode = new BinaryTreeNode();
		
		if (nodeData < 2) {
			nodeData++;
			binaryTreeNode.data = nodeData;
			binaryTreeNode.left = create();
			binaryTreeNode.right = create();
			
		} else {
			binaryTreeNode.left = null;
			binaryTreeNode.right = null;
		}

		return binaryTreeNode;
	}
	
	public static BinaryTreeNode forCreate() {
		
		BinaryTreeNode binaryTreeNode = null;
		
		for(int i=0; i<10;i++) {
			binaryTreeNode = new BinaryTreeNode();
			binaryTreeNode.data = i;
			binaryTreeNode.left = new BinaryTreeNode();
		}
		return null;
	}
}
