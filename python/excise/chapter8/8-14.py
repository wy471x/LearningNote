#!/usr/bin/env python
# coding=utf-8
def make_car(manufucturer,size,**other_infor):
    res =[]
    res.append(manufucturer)
    res.append(size)
    temp = {}
    for key,value in other_infor.items():
           temp[key] = value
    res.append(temp)
    return res

car = make_car('subaru','outback',color = 'blue',tow_package = True)
print(car)
