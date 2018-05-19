package com.swd.daytest;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

	public static void main(String[] args) {
		ScheduledExecutorService pool = Executors.newScheduledThreadPool(10);
		for (int i = 0; i < 10; i++) {
			pool.schedule(()-> System.out.println(Thread.currentThread().getName() + "\t开始发车啦...."), 10, TimeUnit.SECONDS);
			pool.scheduleAtFixedRate(()-> System.out.println(Thread.currentThread().getName() + "\t开始发车啦...."), 1, 1, TimeUnit.SECONDS);
		}

	}

}
