package com.test;

public class PracticeSelect {

	public static void main(String[] args) {
		int[] arr = { 3, 44, 38, 47, 26, 36, 5, 19, 50, 48 };
		select(arr);
	}

	public static void select(int[] arr) {
		int len = arr.length;
		int minValueIndex = 0;
		for (int i = 0; i < len; i++) {
			minValueIndex = i;
			for (int j = i; j < len; j++) {
				if (arr[j] < arr[minValueIndex]) {
					minValueIndex = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[minValueIndex];
			arr[minValueIndex] = temp;
			Utils.printArray(arr);
			System.out.println();
		}
	}

}
