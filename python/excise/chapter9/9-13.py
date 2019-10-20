#!/usr/bin/env python
# coding=utf-8
#words_list = {'for':'循环','print':'输出','str':'将整型值转换为字符串',\
#              'list':'转换为列表'}
#print( "for :" + words_list['for'] + "\n"
#       "print :" + words_list['print'] + "\n"
#       "str :" + words_list['str'] + "\n"
#       "list :" + words_list['list'])
#for key,value in words_list.items():
#    print("key :" + key)
#    print("value :" + value + "\n")
from collections import OrderedDict

orderedDict = OrderedDict()
orderedDict['for'] = '循环'
orderedDict['print'] = '输出'
orderedDict['str'] = '将整型值转换为字符串'
orderedDict['list'] = '转换为列表'

for key,value in orderedDict.items():
    print(key + " : " + value)
