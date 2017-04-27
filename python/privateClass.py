class Student(object):
	"""docstring for Student"""
	def __init__(self, name ,age):
		self._name = name
		self._age = age

	def self_intro(self):
		print('my name is %s,age is %d' % (self._name,self._age))#之前忘记指定占位符类型

swd = Student('swd',23)
swd.self_intro()
swd.name = 'ly'
swd.self_intro()