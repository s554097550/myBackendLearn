#encoding:UTF-8
import urllib.request

url = 'https://s554097550.github.io/'
data = urllib.request.urlopen(url).read()
data = data.decode('UTF8')
print(data)
