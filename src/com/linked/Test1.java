package com.linked;

public class Test1 {
	public static void main(String[] args) {
		
		LinkedData linkedData1 = addTwoNumbers(120, 2322);
		
		while (linkedData1 != null) {
			if (linkedData1.getNext() == null) {
				System.out.print(linkedData1.getVal());
			} else {
				System.out.print(linkedData1.getVal() + "->");
			}

			linkedData1 = linkedData1.getNext();
		}
	}

	public static LinkedData addTwoNumbers(int num1, int num2) {
		if (num1 == 0 && num2 == 0) {
			return new LinkedData();
		}
		int num1Len = getNumber(num1);
		int num2Len = getNumber(num2);

		LinkedData linkedData1 = null;
		LinkedData linkedData2 = null;

		for (int i = 0; i < num1Len; i++) {

			int temp = (int) Math.pow(10, i + 1);
			int wei = (num1 % temp) / (temp / 10);
			LinkedData linkedTemp = new LinkedData();
			linkedTemp.setVal(wei);
			linkedTemp.setPosition(i);
			if (linkedData1 == null) {
				linkedData1 = linkedTemp;
			} else {
				linkedData1.setNext(linkedTemp);
			}
		}

		for (int i = 0; i < num2Len; i++) {

			int temp = (int) Math.pow(10, i + 1);
			int wei = (num2 % temp) / (temp / 10);
			LinkedData linkedTemp = new LinkedData();
			linkedTemp.setVal(wei);
			linkedTemp.setPosition(i);
			if (linkedData2 == null) {
				linkedData2 = linkedTemp;
			} else {
				linkedData2.setNext(linkedTemp);
			}
		}

		if (num1Len < num2Len) {
			LinkedData head = linkedData2;
			int carryBit = 0;
			while (linkedData2 != null) {
				int tempCount = 0;
				if (linkedData1 != null) {
					tempCount = linkedData1.getVal() + linkedData2.getVal() + carryBit;
					linkedData1 = linkedData1.getNext();
				} else {
					tempCount = linkedData2.getVal() + carryBit;
				}
				carryBit = 0;
				if (tempCount > 10) {
					int unitDigit = tempCount % 10;
					linkedData2.setVal(unitDigit);
					carryBit += 1;
				} else {
					linkedData2.setVal(tempCount);
				}

				linkedData2 = linkedData2.getNext();

			}

			return head;
		} else {
			LinkedData head = linkedData1;
			int carryBit = 0;
			while (linkedData1 != null) {
				int tempCount = 0;
				if (linkedData2 != null) {
					tempCount = linkedData1.getVal() + linkedData2.getVal() + carryBit;
					linkedData2 = linkedData2.getNext();
				} else {
					tempCount = linkedData1.getVal() + carryBit;
				}
				carryBit = 0;
				if (tempCount > 10) {
					int unitDigit = tempCount % 10;
					linkedData1.setVal(unitDigit);
					carryBit += 1;
				} else {
					linkedData1.setVal(tempCount);
				}

				linkedData1 = linkedData1.getNext();

			}

			return head;
		}

	}

	public static int getNumber(int n) {
		int count = 0;
		while (Math.abs(n) % 10 > 0 || n / 10 != 0) {
			count++;
			n = n / 10;
		}

		return count;
	}
}
