#!/usr/bin/env python
# coding=utf-8
def normalize(name):
    return name.title()

def prod(L):
    def mul(x, y):
        return x * y
    return reduce(mul, L)

DIGITS = {'0': 0, '1': 1, '2': 2, '3': 3, '4': 4, '5': 5, '6': 6, '7': 7, 
          '8': 8, '9': 9}

def str2float(s):
    index = s.find('.')
    head = s[:index]
    tail = s[index+1:]
    def mul(x, y):
        return x * 10 + y
    def char2num(s):
        return DIGITS[s]
    def decimals(s):
        num = reduce(mul, map(char2num, s))
        i = len(s)
        while i > 0:
            num = num * 0.1
            i = i - 1
        return num
    return reduce(mul, map(char2num, head)) + decimals(tail)

L1 = ['adam', 'LISA', 'barT']
L2 = list(map(normalize, L1))
print(L2)

print('3 * 5 * 7 * 9 =', prod([3, 5 ,7 , 9]))
if prod([3 ,5 , 7, 9]) == 945:
    print('测试成功！')
else:
    print('测试失败！')

print('str2float(\'123.456\') =', str2float('123.456'))
if abs(str2float('123.456') - 123.456) < 0.00001:
    print('测试成功！')
else:
    print('测试失败！')
