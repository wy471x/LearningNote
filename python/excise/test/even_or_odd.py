#!/usr/bin/env python
# coding=utf-8
num = input("Enter a number,and I'll tell you if it's even or odd:")
num = int(num)

if num%2 == 0:
    print("\n" + str(num) + " is even!")
else:
    print("\n" + str(num) + " is odd!")

