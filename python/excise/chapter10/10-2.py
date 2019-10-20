#!/usr/bin/env python
# coding=utf-8

#version 1
with open('learning_python.txt') as file_object:
    contents = file_object.read()

print(contents.replace('Python','C').rstrip())

#version 2
with open('learning_python.txt') as file_object:
    for line in file_object:
        print(line.replace('Python','C').rstrip())

#version 3
with open('learning_python.txt') as file_object:
    lines = file_object.readlines()

absolute_string =''
for line in lines:
    line = line.replace('Python','C')
    absolute_string += line

print(absolute_string.rstrip())
