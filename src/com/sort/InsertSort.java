package com.sort;

/**
 * @author zhisiyi
 * @date 2017年3月21日 下午2:30:21
 * @comment
 */
public class InsertSort {

	public static void main(String[] args) {
		Integer[] arr = { 19, 0, 67, 34, 888, 23, 56 };
		int[] arr1 = { 19, 0, 67, 34, 888, 23, 56 };
		int n = arr.length - 1;
		insertSort1(arr1, n);
		print(arr);
	}

	public static <T extends Comparable<? super T>> void insertSort(T[] a) {
		for (int p = 1; p < a.length; p++) {
			T tmp = a[p];// 保存当前位置p的元素，其中[0,p-1]已经有序
			int j;
			for (j = p; j > 0 && tmp.compareTo(a[j - 1]) < 0; j--) {
				a[j] = a[j - 1];// 后移一位
			}
			a[j] = tmp;// 插入到合适的位置
		}

	}

	public static void insertSort1(int a[], int n) {
		for (int i = 1; i < n; i++) {
			if (a[i] < a[i - 1]) { // 若第i个元素大于i-1元素，直接插入。小于的话，移动有序表后插入
				int j = i - 1;
				int x = a[i]; // 复制为哨兵，即存储待排序元素
				a[i] = a[i - 1]; // 先后移一个元素
				while (x < a[j] && j < n - 1) { // 查找在有序表的插入位置
					a[j + 1] = a[j];
					j++; // 元素后移
				}
				a[j + 1] = x; // 插入到正确位置
			}
			print(a); // 打印每趟排序的结果
		}

	}

	private static void print(Integer[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private static void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
