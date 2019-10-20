#!/usr/bin/env python
# coding=utf-8
familiar_person1 = {'first_name':'Kobe',\
                    'last_name':'Bryant',\
                    'age':31,\
                    'city':'Los Angeles'}
familiar_person2 = {'first_name':'Lebron',\
                    'last_name':'James',\
                    'age':34,\
                    'city':'Los Angeles'}
familiar_person3 = {'first_name':'Dwyane',\
                    'last_name':'Wade',\
                    'age':35,\
                    'city':'Miami'}
people = [familiar_person1,familiar_person2,familiar_person3]

for person in people:
    print(person['first_name']) 
    print(person['last_name']) 
    print(person['age'])
    print(person['city'])
    print("\n")
