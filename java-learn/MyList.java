/**
 * All rights Reserved, Designed By www.rongdasoft.com 
 * @version V1.0
 * @Title: MyList.java
 * @Description:
 * @author: swd
 * @date: 2018年4月9日
 * @Copyright: 2018年4月9日 www.rongdasoft.com Inc. All rights reserved.
 */
package com.swd.daytest;

/**
 * @ClassName: MyList 
 * @Description: TODO
 * @author swd
 * @date 2018年4月9日
 */

public class MyList {
	private static final int DEFAULT_CAPACITY = 10;
	private String[] elementData;
	private int size;
	
	public MyList() {
		elementData = new String[DEFAULT_CAPACITY];
	}
	private void add(String e) {
		this.elementData[size++] = e;
	}
	
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add("123");
		list.add(123);//?
	}
}
