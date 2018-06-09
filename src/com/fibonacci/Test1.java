package com.fibonacci;

/**
 * @author zhisiyi
 * @date 2017年5月3日 下午5:11:50
 * @comment
 */
public class Test1 {

	public static void main(String[] args) {
		System.out.println(getMethodNumber1(5));
	}

	private static int getMethodNumber(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		if (n == 2)
			return 1;
		return getMethodNumber(n - 1) + getMethodNumber(n - 2);
	}

	private static int getMethodNumber1(int n) {
		if (n < 0)
			return 0;
		if (n <= 2 && n >= 0)
			return n;
		int s1 = 1;
		int s2 = 2;
		int s = 1;
		for (int i = 3; i <= n; i++) {
			s = s1 + s2;
			s1 = s2;
			s2 = s;
		}
		return s;
	}
}
