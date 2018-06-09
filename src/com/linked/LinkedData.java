package com.linked;

public class LinkedData {
	private int position;
	private int val;
	private LinkedData next;

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public LinkedData getNext() {
		return next;
	}

	public void setNext(LinkedData next) {
		if (this.next == null)
			this.next = next;
		else
			this.next.setNext(next);
	}

}
