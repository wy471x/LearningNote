#!/usr/bin/env python
# coding=utf-8
class Restaurant(object):
    """餐厅"""
    def __init__(self,restaurant_name,cuisine_type):
        self.restaurant_name = restaurant_name
        self.cuisine_type = cuisine_type
        self.number_served = 0
    """餐厅具体细节"""
    def describe_restaurant(self):
        print("The restaurant's name is " + self.restaurant_name + ".")
        print("The cuisine type is " + self.cuisine_type + ".")
        print("The number of served people are " + str(self.number_served))
    """餐厅开放"""
    def open_restaurant(self):
        print(self.restaurant_name.title() + " is opening!")
    """餐厅就客人数"""
    def set_number_served(self,number):
        self.number_served = number
    """增量递增"""
    def increment_number_served(self,increment):
        self.number_served += increment

class IceCreamStand(Restaurant):
    def __init__(self,restaurant_name,cuisine_type):
        super(IceCreamStand,self).__init__(restaurant_name,cuisine_type)
        self.flavors = ['strawberry','mango','hami melon']

    def display(self):
        for temp in self.flavors:
            print(temp)
    
icecream = IceCreamStand('WanDa','QingZheng')
icecream.describe_restaurant()
icecream.display()
