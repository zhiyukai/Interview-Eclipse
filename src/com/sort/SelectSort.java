package com.sort;

/**
 * @author zhisiyi
 * @date 2017年3月21日 下午2:45:49
 * @comment
 */
public class SelectSort {

	public static void main(String[] args) {
		int[] arr = { 19, 0, 67, 34, 888, 23, 56 };
		selectSort(arr);
	}

	public static void selectSort(int[] arr) {
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			int key = selectMinKey(arr, size, i);
			if (key != i) {
				int temp = arr[i];
				arr[i] = arr[key];
				arr[key] = temp;
			}
			System.out.println("第" + i + "次排序");
			print(arr);
		}
	}

	public static int selectMinKey(int[] arr, int n, int i) {
		int k = i;
		for (int j = i + 1; j < n; j++) {
			if (arr[k] > arr[j])
				k = j;
		}
		return k;
	}

	private static void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
