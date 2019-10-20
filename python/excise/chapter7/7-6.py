#!/usr/bin/env python
# coding=utf-8
prompt = "\nHow old are you? "
active = True
while active:
    age = input(prompt)
    if age == 'quit':
        active = False
    elif age < 3:
        print("free for person under 3 years old!")
    elif age <= 12:
        print("10 dollars for person between 3 and 12 years old!")
    elif age > 12:
        print("15 dollars for person above 12 years old!")
