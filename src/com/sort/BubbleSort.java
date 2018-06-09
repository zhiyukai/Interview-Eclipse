package com.sort;

/**
 * @author zhisiyi
 * @date 2017年3月21日 上午11:00:36
 * @comment
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 19, 0, 67, 34, 888, 23, 56 };
		bubbleSort3(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void bubbleSort1(int[] arr) {
		int count = 0;
		int size = arr.length - 1;
		for (int i = 0; i < size; i++) {// 控制排几趟
			for (int j = 0; j < size; j++) {// 控制每趟把最大的数放在后面
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				count++;
			}
		}
		System.out.println("内层循环次数" + count);
	}

	public static void bubbleSort2(int[] arr) {
		int count = 0;
		int size = arr.length - 1;
		while (size > 0) {// 控制排几趟
			int pos = 0;
			for (int j = 0; j < size; j++) {// 控制每趟把最大的数放在后面
				if (arr[j] > arr[j + 1]) {
					pos = j;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				count++;
			}
			size = pos;
		}
		System.out.println("内层循环次数" + count);
	}

	public static void bubbleSort3(int[] arr) {
		int count = 0;
		int low = 0;
		int high = arr.length - 1;
		while (high > low) {// 控制排几趟
			int temp = 0;
			for (int i = low; i < high; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			high--;
			for (int j = high; j > low; j--) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
			low++;
			count++;
		}
		System.out.println("内层循环次数" + count);
	}
}
