#!/usr/bin/env python
# coding=utf-8
def count():
    fs = []
    for i in range(1, 4):
        def f():
            return i * i
        fs.append(f)
    return fs
#integer , nonvariable object
def createCounter():
    n = 0
    def counter():
        nonlocal n
        n =  n + 1
        return n
    return counter
#generator , variable object 
def createCounter2():
    num = (x for x in range(1, 1000, 1))
    def counter():
        return next(num)
    return counter
#list , variable object
def createCounter3():
    count = [0]
    def counter():
        count[0] += 1
        return count[0]
    return counter
#dict , variable object
def createCounter4():
    num = {'0': 0}
    def counter():
        num['0'] += 1
        return num['0']
    return counter
counterA = createCounter4()
print(counterA(), counterA(), counterA(), counterA(), counterA(), counterA())
counterB = createCounter4()
if [counterB(), counterB(), counterB(), counterB()] == [1, 2, 3, 4]:
    print('测试通过！')
else:
    print('测试失败！')
