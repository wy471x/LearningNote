#!/usr/bin/env python
# coding=utf-8
cities = {'wuhan':{'country':'china','population':'1800万','fact':'Yellow Crane Tower'},
          'beijing':{'country':'china','population':'2300万','fact':'The Palace Museum'},
          'guangzhou':{'country':'china','population':'2100万','fact':'Canton Tower'}
         }

for city,infor in cities.items():
    print(city)
    print(infor['country'])
    print(infor['population'])
    print(infor['fact'])
    print("\n")
