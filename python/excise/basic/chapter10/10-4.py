#!/usr/bin/env python
# coding=utf-8
filename = 'guest_book.txt'

with open(filename,'a') as file_object:
    guest = input('Please input your name: ')
    print("Hello," + guest + ".")
    record = "Hello," + guest + "."
    file_object.write(record + "\n")
