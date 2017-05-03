class Student(object):
	"""docstring for Student"""
	def __init__(self, name ,age):
		self.__name = name
		self.__age = age

	def self_intro(self):
		print('my name is %s,age is %d' % (self.__name,self.__age))#之前忘记指定占位符类型

swd = Student('swd',23)
swd.self_intro()
swd.name = 'ly'
swd.self_intro()