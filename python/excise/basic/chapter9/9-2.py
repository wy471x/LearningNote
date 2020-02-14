#!/usr/bin/env python
# coding=utf-8
class Restaurant(object):
    """餐厅"""
    def __init__(self,restaurant_name,cuisine_type):
        self.restaurant_name = restaurant_name
        self.cuisine_type = cuisine_type

    def describe_restaurant(self):
        print("The restaurant's name is " + self.restaurant_name + ".")
        print("The cuisine type is " + self.cuisine_type + ".")
    
    def open_restaurant(self):
        print(self.restaurant_name.title() + " is opening!")

restaurant1 = Restaurant('WanDa','QingZhen')
restaurant1.describe_restaurant()

restaurant2 = Restaurant('YiJia','HongShao')
restaurant2.describe_restaurant()

restaurant3 = Restaurant('Newman','Western Style')
restaurant3.describe_restaurant()
