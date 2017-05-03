import json
import pickle
person = dict(name='swd',age=20,sex='M')
f = open('serialize.txt','wb')
pickle.dump(person,f)
f.close()
f1 = open('serialize.txt','rb')
d = pickle.load(f1)
f1.close()
print(d)
print(json.dumps(person))