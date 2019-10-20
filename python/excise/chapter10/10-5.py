#!/usr/bin/env python
# coding=utf-8
filename = 'reason.txt'

with open('reason.txt','a') as file_object:
    while True:
        reason = input("Please input a reason you like programing: ")
        if reason == 'q':
            break
        else:
            file_object.write(reason + "\n")
