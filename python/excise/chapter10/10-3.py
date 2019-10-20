#!/usr/bin/env python
# coding=utf-8
filename = 'guest.txt'

with open('guest.txt','a') as file_object:
    guest = input("Please input your name: ")
    file_object.write(guest+"\n")
