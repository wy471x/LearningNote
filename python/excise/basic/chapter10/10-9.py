#!/usr/bin/env python
# coding=utf-8
def read_file(filename):
    try:
       with open(filename) as file_object:
         contents = file_object.read()
    except IOError:
         pass
    else:
        print(contents)
   
read_file('cats.txt')
print('\n')
read_file('dogs.txt')
