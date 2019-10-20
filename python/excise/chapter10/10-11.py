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
    filename = 'number.json'
    num = input("Please enter a number: ")
    with open(filename,'w') as f_obj:
       json.dump(num,f_obj)
    
store_number()
num = get_stored_number()
print( "I know your favorite number! It's " + str(num) + ".")
