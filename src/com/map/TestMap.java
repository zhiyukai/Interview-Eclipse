package com.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author zhisiyi
 * @date 2017年3月27日 上午8:47:45
 * @comment
 */
public class TestMap {
	static TreeMap<Integer, String> tempMap = new TreeMap<>();

	public static void main(String[] args) {
		testSortMap();
		print();
	}

	private static void testSortMap() {
		// for (int i = 0; i < 15; i++) {
		// tempMap.put(i, i + "元素");
		// }
		tempMap.put(41, 41 + "元素");
		tempMap.put(4, 4 + "元素");
		tempMap.put(34, 34 + "元素");
		tempMap.put(4, 4 + "元素");
		tempMap.put(1, 1 + "元素");
		tempMap.put(0, 0 + "元素");
		tempMap.put(12, 12 + "元素");
		tempMap.put(56, 56 + "元素");
		tempMap.put(24, 24 + "元素");
		tempMap.put(37, 37 + "元素");
		tempMap.put(90, 90 + "元素");
	}

	private static void print() {
		// Iterator<Integer> it = tempMap.keySet().iterator();
		// while (it.hasNext()) {
		// System.out.print(it.next() + " ");
		// }

		Set<Map.Entry<Integer, String>> it = tempMap.entrySet();
		Iterator<Entry<Integer, String>> tt = it.iterator();
		while (tt.hasNext()) {
			System.out.print(tt.next().getValue() + " ");
		}
	}

}
