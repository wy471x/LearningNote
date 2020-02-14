#!/usr/bin/env python
# coding=utf-8
favorite_number = {'lele':[1,2,3,4],'lili':[5,6,7,8],'didi':[9,10,11],\
                   'xiongda':[12,13,14,15,16]}
for name,numbers in favorite_number.items():
    print(name + ":")
    for num in numbers:
        print("\t" + str(num))
    print("\n")
