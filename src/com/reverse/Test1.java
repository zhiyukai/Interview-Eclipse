package com.reverse;

/**
 * @author zhisiyi
 * @date 2017年4月29日 下午3:33:30
 * @comment
 */
public class Test1 {
	public static void main(String[] args) {
		Node node1 = new Node("A");
		Node node2 = new Node("B");
		Node node3 = new Node("C");
		Node node4 = new Node("D");
		Node node5 = new Node("E");
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		Node newNode = reverse1(node1);
		while (newNode != null) {
			System.out.print(newNode.data + " ");
			newNode = newNode.next;
		}
	}

	public static Node reverse1(Node node) {

		if (node == null)
			return new Node("空");
		Node pre = node;
		Node cur = node.next;
		Node temp;
		while (cur != null) {
			temp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = temp;
		}
		node.next = null;
		return pre;
	}

	// 递归反转
	private static Node reverse2(Node head) {
		if (head.next == null) {
			return head;
		}
		System.out.println("1" + head.data);
		Node reverseHead = reverse2(head.next);
		System.out.println("3" + reverseHead.data);
		System.out.println("2" + head.data);

		head.next.next = head;
		head.next = null;
		return reverseHead;
	}

	static class Node {
		Node next;
		String data;

		public Node(String data) {
			this.data = data;
		}
	}
}
