#!/usr/bin/env python
# coding=utf-8
keke = {'type':'pig','owner':'Wan'}
nini = {'type':'dog','owner':'Wang'}
bubu = {'type':'cat','owner':'Ben'}

pets = [keke,nini,bubu]

for pet in pets:
    print(pet['type'])
    print(pet['owner'])
    print("\n")
