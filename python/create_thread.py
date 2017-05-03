import time,threading
#新线程执行的代码
def loop_thread():#这里不需要传参数，线程的名字在启动线程的时候给的
	print('线程%s正在执行'%threading.current_thread().name)
	n = 0
	while n < 5:
		n = n+1
		print('线程%s运行第%d遍'%(threading.current_thread().name,n))
		time.sleep(1)
	print('线程%s结束运行'%threading.current_thread().name)	
print('线程%s开始运行'%threading.current_thread().name)
t = threading.Thread(target=loop_thread,name='儿子')
t.start()
t.join()
print('线程%s结束了'%threading.current_thread().name)