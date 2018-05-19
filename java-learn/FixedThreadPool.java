package com.swd.daytest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
	public static void main(String[] args) {
		/***
		 * 创建固定大小的线程池。每次提交一个任务就创建一个线程，直到线程达到线程池的最大大小。线程池的大小一旦达到最大值就会保持不变，如果某个线程因为执行异常而结束，那么线程池会补充一个新线程。
		 */
		ExecutorService pool = Executors.newFixedThreadPool(8);
		for (int i = 0; i < 10; i++) {
			//当线程池线程数少于任务数时，完成任务的空闲线程会继续工作
			pool.execute(()->System.out.println(Thread.currentThread().getName() + "\t开始发车啦...."));
		}
		
		ExecutorService pool2 = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			//任务数和线程数相同，每人一个任务，正好分配
			pool2.execute(()->System.out.println(Thread.currentThread().getName() + "\t开始发车啦...."));
		}
	}
	
}
