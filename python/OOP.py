class Animal(object):
	def run(self):
		print("animal is runing...")

class Dog(Animal):
	def run(self):
		print("dog is runing...")

class Cat(Animal):
	def run(self):
		print("cat is runing...")

class Oop(object):
	def poly(self,animal):
		animal.run()


a = Animal()
a.run()
b = Dog()
b.run()
c = Cat()
c.run()

o = Oop()
o.poly(a)
o.poly(c)
o.poly(b)

print(dir(a))
