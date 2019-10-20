#!/usr/bin/env python
# coding=utf-8
def show_magicians(magicians):
    for name in magicians:
        print(name)

def make_great(magicians):
    res = []
    while magicians:
        temp = magicians.pop() + " the Great"
        res.append(temp)
    return res

magicians = ['liuqian','david','rose','lynn']
temp = make_great(magicians)
show_magicians(temp)
