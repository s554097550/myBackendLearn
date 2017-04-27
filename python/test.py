def f1(a, b, c=0, *args, **kw):
    print('a =', a, 'b =', b, 'c =', c, 'args =', args, 'kw =', kw)

def f2(a, b, c=0, *, d, **kw):
    print('a =', a, 'b =', b, 'c =', c, 'd =', d, 'kw =', kw)

f1(1, 2,1,2,d=3)
f1(4, 5, 6,7,8,9)

def person(name='swd', age=12, city='bj'):
    print(name,age,city)
person(city='wlmq')