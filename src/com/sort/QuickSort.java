package com.sort;

/**
 * @author zhisiyi
 * @date 2017年3月21日 上午11:56:48
 * @comment
 */
public class QuickSort {

	public static void main(String[] args) {

		int[] arr = { 19, 0, 67, 34, 888, 23, 56 };
		int low = 0;
		int high = arr.length - 1;

		quickSort(arr, low, high);

		System.out.println("最终的顺序：");
		print(arr);
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int baseIndex = part(arr, low, high);
			quickSort(arr, low, baseIndex - 1);
			quickSort(arr, baseIndex + 1, high);
		}
	}

	public static int part(int[] arr, int low, int high) {

		int base = arr[low];

		while (low < high) {
			while (low < high && base <= arr[high])
				high--;
			swap(arr, low, high);
			while (low < high && base >= arr[low])
				low++;
			swap(arr, low, high);

		}
		print(arr);
		return low;
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	private static void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
