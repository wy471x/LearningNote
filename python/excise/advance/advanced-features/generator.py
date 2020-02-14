#!/usr/bin/env python
# coding=utf-8

def fib(max):
    n, a, b = 0, 0, 1
    while n < max:
        print(b)
        a, b = b, a + b
        n = n + 1
    return 'done'

#define generator
def fib2(max):
    n, a, b = 0, 0, 1
    while n < max:
        yield b
        a, b = b, a + b
        n = n + 1
    return

def odd():
    print('step 1')
    yield 1
    print('step 2')
    yield(3)
    print('step 3')
    yield(5)

def triangles():
    temp = []
    while True:
        if len(temp) == 0:
            temp = [1]
            yield temp
        elif len(temp) == 1:
            temp = [1, 1]
            yield temp
        else:
            temp2 = []
            temp2.append(1)
            templen = len(temp)
            i = 0
            while i < templen - 1:
                temp2.append(temp[i] + temp[i + 1])
                i = i + 1
            temp2.append(1)
            temp = temp2
            yield temp
    pass

def triangles():
    L = [1]
    while True:
        yield L
        L = [1] + [L[n] + L[n+1] for n in range(len(L) - 1)] + [1]
    pass

for n in range(10):
    print(n)
n = 0
results = []
for t in triangles2():
    results.append(t)
    n = n + 1
    if n == 10:
        break

for t in results:
    print(t)

if results == [
    [1],
    [1, 1],
    [1, 2 , 1],
    [1, 3 , 3, 1],
    [1, 4, 6, 4, 1],
    [1, 5, 10, 10, 5, 1],
    [1, 6, 15, 20, 15, 6, 1],
    [1, 7, 21, 35, 35, 21, 7, 1],
    [1, 8, 28, 56, 70, 56, 28, 8, 1],
    [1, 9, 36, 84, 126, 126, 84, 36, 9, 1]
]:
    print('success!')
else:
    print('failure!')
