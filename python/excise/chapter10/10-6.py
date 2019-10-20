#!/usr/bin/env python
# coding=utf-8
while True:
    try: 
       num1 = int(raw_input("Please input first number: "))
       num2 = int(raw_input("input second number: "))
    except ValueError:
        print("That input is not number!")
    print(str(num1+num2))
