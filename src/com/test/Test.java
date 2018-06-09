package com.test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zhisiyi
 * @date 2017年3月21日 下午3:34:22
 * @comment
 */
public class Test {
	static ArrayList<String> data = new ArrayList<String>();

	public static void main(String[] args) {
		// SingletonEnum singleton = SingletonEnum.SingletonEnum;
		// singleton.setName("张三");
		// SingletonEnum singleton2 = SingletonEnum.SingletonEnum;
		// singleton2.setName("李四");
		// System.out.println(singleton.getName());

		// method1();
		method2(System.currentTimeMillis());

	}

	private static void method2(double totalMillis) {
		String s = String.format("[%7sms]%s %-6s %s",
                String.format("%.3f", totalMillis),
                "[ui]",
                "onCreate" + ":",
                "主线程");
		System.out.println(s);
	}

	private static void method() {
		for (int i = 0; i < 20; i++) {
			data.add(i + "元素");
		}

		Iterator<String> iterator = data.iterator();

		while (iterator.hasNext()) {
			if (iterator.next().equals("3元素")) {
				iterator.remove();
			}
		}

		print();

	}

	private static void method1() {
		for (int i = 0; i < 20; i++) {
			data.add(i + "元素");
		}
		for (int i = 0; i < data.size(); i++) {
			String s = data.get(i);
			if ("2元素".equals(s)) {
				data.remove(s);
			}
		}
		print();

	}

	private static void print() {
		int size = data.size();
		for (int i = 0; i < size; i++) {
			System.out.print(data.get(i) + "　");
		}
	}
}
