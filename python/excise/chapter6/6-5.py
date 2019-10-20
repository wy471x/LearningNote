#!/usr/bin/env python
# coding=utf-8
rivers = {'nile':'egypt','yellow river':'china','amazon':'brazil'}
for river,country in rivers.items():
    print("The " + river + " runs through " + country + ".")

for river in rivers.keys():
    print(river)

for country in rivers.values():
    print(country)
