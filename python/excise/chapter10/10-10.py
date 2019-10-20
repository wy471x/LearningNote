#!/usr/bin/env python
# coding=utf-8
with open('beautiful_lakeland.txt') as file_object:
    contents = file_object.read()
    print("'the' occurs: "+ str(contents.rstrip().lower().count('the')))
