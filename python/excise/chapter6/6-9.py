#!/usr/bin/env python
# coding=utf-8
favorite_places = {'Yong':['guilin','wuhan','chongqin'],'Bei':['wuhan','qingdao','kunming'],'Qin':['wuhan','yichang','suzhou']}

for name,places in favorite_places.items():
    print(name)
    for place in places:
        print(place)
    print("\n")
