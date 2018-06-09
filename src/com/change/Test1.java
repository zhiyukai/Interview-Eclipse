package com.change;

/**
 * @author zhisiyi
 * @date 2017年4月29日 下午1:32:04
 * @comment
 */
public class Test1 {

	/**
	 * 请实现一个函数，把字符串中的每个空格替换成"%20"。 例如输入"We are happy"，则输出"We%20are%20happy"
	 */
	public static void main(String[] args) {
		String str = "We are happy";
		System.out.println(change(str));
	}

	public static String change(String str) {
		if (str == null)
			return "";
		int len = str.length();
		if (len == 0)
			return "";
		int count = 0;
		char[] tempCharArray = str.toCharArray();
		for (int i = 0; i < len; i++) {
			if (tempCharArray[i] == ' ')
				count++;
		}
		int j = 0;
		char[] result = new char[len + 2 * count];
		for (int i = 0; i < len; i++) {
			if (tempCharArray[i] == ' ') {
				result[j] = '%';
				result[j + 1] = '2';
				result[j + 2] = '0';
				j = j + 3;
			} else {
				result[j] = tempCharArray[i];
				j++;
			}
		}

		return new String(result);
	}

}
