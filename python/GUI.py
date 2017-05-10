from tkinter import *
class Application(Frame):
	"""docstring for Application"""
	def __init__(self, master=None):
		Frame.__init__(self,master)
		self.pack()
		self.createWidgets()
	def createWidgets(self):
		self.helloLabel = Label(self,text='hello python')
		self.helloLabel.pack()
		self.quitButton = Button(self,text='Quit',command=self.quit)
		self.quitButton.pack()

app = Application()
app.master.title('hello python')
app.mainloop()
