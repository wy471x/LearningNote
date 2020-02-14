#!/usr/bin/env python
# coding=utf-8
def _odd_iter():
    n = 1
    while True:
        n = n + 2
        yield n

def _not_divisible(n):
    def f(x):
        return x % n > 0
    return f(n)
def primes():
    yield 2
    it = _odd_iter()
    while True:
        n = next(it)
        yield n
        it = filter(_not_divisible, it)

def is_palindrome(n):
    num2str = str(n)
    i, j = 0, len(num2str) - 1
    while i <= j:
        if num2str[i] != num2str[j]:
            return False
        i = i + 1
        j = j - 1
    return True

output = filter(is_palindrome, range(1, 1000))
print('1~1000:', list(output))
if list(filter(is_palindrome, range(1, 200))) ==\
    [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 
     121, 131, 141, 151, 161, 171, 181, 191]:
    print('测试成功！')
else:
    print('猜测失败！')
