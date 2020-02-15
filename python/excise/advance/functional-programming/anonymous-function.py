#!/usr/bin/env python
# coding=utf-8
'''
 lambda expression use. (anonymous function)
'''
print(list(map(lambda x: x*x, [1, 2, 3, 4, 5, 6, 7, 8, 9])))

#def f(x):           <==>   lambda x: x*x
#        return x*x

def is_odd(n):
    return n % 2 == 1

L = list(filter(is_odd, range(1, 20)))
print(L)

L2 = list(filter(lambda x: x % 2 == 1, range(1, 20)))
print(L2)
