def multi_Add(*par):
	sum = 0;
	for num in par:
		sum+=num
	print(sum)

multi_Add(1,2,3)
multi_Add()
a = (3,4,5,6)
multi_Add(*a)#这种方法有效，常见

def person(name,age,**info):
	print('name:',name,',age:',age,',info:',info)

#person('swd',12,{city='wlmq',address='ksdl'})这是我之前错误的方法
person('swd',12,city='wlmq',address='ksdl')