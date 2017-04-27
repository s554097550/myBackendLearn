class Student(object):
	"""docstring for Student"""
	def __init__(self, name ,age):
		self.name = name
		self.age = age

	def self_intro(self):
		print('my name is %s,age is %d' % (self.name,self.age))#之前忘记指定占位符类型

swd = Student('swd',23)
swd.self_intro()