#forck不能再window下运行
import os
print('进程%s开始..' % os.getpid())
pid = os.fork()
if pid == 0:
	print('我是子线程（%s），我的父亲是%s' %(os.getpid(),os.getppid()))
else:
	print('我是父亲%s，我创建了儿子%s' %(os.getpid(),pid))