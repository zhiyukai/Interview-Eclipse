package com.test;

public class PracticeBubble {

	public static void main(String[] args) {

		int[] arr = { 3, 44, 38, 47, 26, 36, 5, 19, 50, 48 };

		bubble(arr);

	}

	public static void bubble(int[] arr) {
		int len = arr.length;

		for (int i = 0; i < len - i; i++) {

			for (int j = 0; j < len - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			Utils.printArray(arr);

			System.out.println();
		}
	}

	

}
