#!/usr/bin/env python
# coding=utf-8
prompt = "\nPlease input a kind of pizza topping:  "
message = ""
while True:
    message = input(prompt)
    if message == 'quit':
        break;
    else:
        print("Adding " + message + ".")
