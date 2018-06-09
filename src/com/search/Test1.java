package com.search;

/**
 * @author zhisiyi
 * @date 2017年4月29日 下午12:53:09
 * @comment
 */

public class Test1 {
	/**
	 * 在一个二维数组中，每一行都按照从左到右递增 的顺序排序， 每一列都按照从上到下递增的顺序排序。 请完成一个函数，输入这样的一个二维数组
	 * 和一个整数，判断数组中是否函数该整数。
	 */
	private static int count;

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 }, { 16, 18, 21, 25 } };

		searchTarget(arr, 13);
		System.out.println("查找的次数count=" + count);

	}

	public static boolean searchTarget(int[][] arr, int value) {
		if (arr == null)
			return false;
		int arrLength = arr.length;
		int arr1Length = arr[0].length;
		int i = 0;
		int j = arr1Length - 1;
		// 1. for 循环
		// for (int i = 0; i < arrLength; i++) {
		// for (int j = arr1Length - 1; j >= 0; j--) {
		// count++;
		// if (arr[i][j] == value) {
		// return true;
		// }
		// if (arr[i][j] < value)
		// break;
		// }
		// }
		// 2. while
		while (i < arrLength && j >= 0) {
			count++;
			if (arr[i][j] == value)
				return true;
			if (arr[i][j] < value)
				i++;
			else
				j--;
		}
		return false;
	}
}
