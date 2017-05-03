from multiprocessing import Process
import os

# 子进程要执行的代码
def process_fun(name):#需要传一个进程的名字
	print('我是儿子，我叫 %s(%s)'%(name,os.getpid()))

if __name__ == '__main__':
	print('父进程是%s'%os.getpid())
	p = Process(target=process_fun,args=('小明',))
	print('儿子出生了')
	p.start()
	p.join()
	print('儿子寿元已尽')