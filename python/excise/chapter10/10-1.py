#!/usr/bin/env python
# coding=utf-8

#version 1
with open('learning_python.txt') as file_object:
    contents = file_object.read()

print(contents.rstrip())

#version 2
with open('learning_python.txt') as file_object:
    for line in file_object:
        print(line.rstrip())

#version 3
with open('learning_python.txt') as file_object:
    lines = file_object.readlines()

absolute_string =''
for line in lines:
 absolute_string += line

print(absolute_string.rstrip())
