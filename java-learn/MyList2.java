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

public class MyList2<T> {
	private static final int DEFAULT_CAPACITY = 10;
	private Object[] elementData;
	private int size;
	
	public MyList2() {
		elementData = new Object[DEFAULT_CAPACITY];
	}
	private void add(T e) {
		this.elementData[size++] = e;
	}
	
	public static void main(String[] args) {
		MyList2<String> myList2 = new MyList2<String>();
		myList2.add("123");
		myList2.add("qwe");
		
		MyList2<Integer> myList3 = new MyList2<Integer>();
		myList3.add(123);
		myList3.add(234);
		
		MyList2<Integer> myList4 = new MyList2<Integer>();
		for (int i = 0; i < 11; i++) {
			myList4.add(i);//?
		}
	}
}
