package com.designPattern;

/**
 * @author zhisiyi
 * @date 2017年3月21日 下午3:33:03
 * @comment
 */
public enum SingletonEnum {
	SingletonEnum;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
