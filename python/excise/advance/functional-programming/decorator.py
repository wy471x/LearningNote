#!/usr/bin/env python
# coding=utf-8
'''
 decorator
'''
import time, functools

def metric(fn):
    @functools.wraps(fn)
    def wrapper(*args, **kw):
        print('%s executed in %s ms.' % (fn.__name__, 10.24))
        return fn(*args, **kw)
    return wrapper

@metric
def fast(x, y):
    time.sleep(0.0012)
    return x + y
@metric
def slow(x, y, z):
    time.sleep(0.1234)
    return x * y * z

f = fast(11, 22)
s = slow(11, 22, 33)
if f != 33:
    print('测试失败！')
elif s != 7986:
    print('测试失败！')

def log(a):
    if isinstance(a, str):
        def decorator(func):
            @functools.wraps(func)
            def wrapper(*args, **kw):
                print('%s %s(): ' % (a, func.__name__))
                return func(*args, **kw)
            return wrapper
        return decorator
    else:
        @functools.wraps(a)
        def wrapper(*args, **kw):
            return a(*args, **kw)
        return wrapper
@log('execute')
def now():
    print('2020-2-15')

@log
def before():
    print('2020-2-14')

before()
now()
