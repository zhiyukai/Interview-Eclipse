package com.string.replace;

public class Test {
	public static void main(String[] args) {
		String s = "how are you";
		System.out.println(stringReplace(s, " ", "%20"));
	}

	public static String stringReplace(String src, String target, String replace) {
		if (src == null) {
			throw new NullPointerException("src == null");
		}

		if (target == null) {
			throw new NullPointerException("target == null");
		}

		if (replace == null) {
			throw new NullPointerException("replace == null");
		}

		int count = src.length();
		int lastMatch = 0;
		StringBuilder sb = null;
		
		while (true) {
			int currentMatch = indexOf(src, target, lastMatch);
			if (currentMatch == -1) {
				break;
			}

			if (sb == null) {
				sb = new StringBuilder(count);
			}

			sb.append(src, lastMatch, currentMatch);
			sb.append(replace);
			lastMatch = currentMatch + target.length();
		}

		if (sb != null) {
			sb.append(src, lastMatch, count);
			return sb.toString();
		} else {
			return src;
		}
	}

	private static int indexOf(String source, String target, int fromIndex) {
		if (fromIndex >= source.length()) {
			return (target.length() == 0 ? source.length() : -1);
		}
		if (fromIndex < 0) {
			fromIndex = 0;
		}
		if (target.length() == 0) {
			return fromIndex;
		}

		char first = target.charAt(0);
		int max = (source.length() - target.length());

		for (int i = fromIndex; i <= max; i++) {
			if (source.charAt(i) != first) {
				while (++i <= max && source.charAt(i) != first)
					;
			}
			if (i <= max) {
				int j = i + 1;
				int end = j + target.length() - 1;
				for (int k = 1; j < end && source.charAt(j) == target.charAt(k); j++, k++)
					;

				if (j == end) {
					return i;
				}
			}
		}
		return -1;
	}
}
