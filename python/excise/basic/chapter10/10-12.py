#!/usr/bin/env python
# coding=utf-8
import json

def get_stored_number():
    filename = 'number.json'
    try:
        with open(filename) as f_obj:
            num = json.load(f_obj)
    except IOError:
        return None
    else:
        return num

def store_number():
    resnum = get_stored_number()
    if resnum:
       print("I know your favorite number!It's " + str(resnum) + ".")
    else:
       num = input("Please enter your favorite number: ")
       filename = 'number.json'
       with open(filename,'w') as f_obj:
           json.dump(num,f_obj)

store_number()
