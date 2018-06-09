package com.fibonacci;

/**
 * 递归/动态规划：有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶或3阶。 实现一个算法，计算小孩有多少种上楼梯的方式。 输入n，返回一个整数。
 * 
 * @author zhishaoju
 *
 */
public class Test2 {

	public static void main(String[] args) {
		System.out.println(getCount(30));
	}

	public static int getCount(int n) {
		try {
			if (n == 0)
				return 0;
			if (n == 1) {
				return 1;
			}
			if (n == 2) {
				return 2;
			}
			if (n == 3) {
				return 4;
			}

			if (n > 3) {
				return getCount(n - 1) + getCount(n - 2) + getCount(n - 3);
			}
		} catch (Exception e) {
			return 0;
		}
		return 0;
	}

}
