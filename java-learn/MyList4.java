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

import java.util.Arrays;

/**
 * @ClassName: MyList
 * @Description: TODO
 * @author swd
 * @date 2018年4月9日
 */

public class MyList4<T> {
	private static final int DEFAULT_CAPACITY = 10;
	private Object[] elementData;// 保存元素数组
	private int size; // 已经保存了多少个元素

	public MyList4() {
		elementData = new Object[DEFAULT_CAPACITY];
	}

	private void add(T e) {
		ensureCapacity();
		this.elementData[size++] = e;
	}

	private void ensureCapacity() {
		int minCapacity = size + 1;
		int oldCapacity = elementData.length;
		if (minCapacity > oldCapacity) {
			int newCapacity = oldCapacity + (oldCapacity >> 1);
			grow(newCapacity);
		}
	}

	private void grow(int newCapacity) {
		elementData = Arrays.copyOf(elementData, newCapacity);
	}

	public static void main(String[] args) {
		MyList4<String> myList2 = new MyList4<String>();
		myList2.add("123");
		myList2.add("qwe");

		MyList4<Integer> myList3 = new MyList4<Integer>();
		myList3.add(123);
		myList3.add(234);

		MyList4<Integer> myList4 = new MyList4<Integer>();
		for (int i = 0; i < 11; i++) {
			myList4.add(i);// ?
		}
	}
}
