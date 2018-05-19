package com.swd.daytest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
	public static void main(String[] args) {
		/***
		 * 创建一个可缓存的线程池。如果线程池的大小超过了处理任务所需要的线程，那么就会回收部分空闲的线程，当任务数增加时，此线程池又添加新线程来处理任务。
		 */
		ExecutorService pool = Executors.newCachedThreadPool();
		for (int i = 0; i < 20; i++) {
			//线程池中线程数不要设置，会根据任务大小来决定，首先回收已经完成任务的空闲线程，然后如果还不够则建立新的线程
			//当前控制台输出最大线程数12
			pool.execute(() -> System.out.println(Thread.currentThread().getName() + "\t开始发车啦...."));
		}
	}
}
