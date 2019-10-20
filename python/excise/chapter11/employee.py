#!/usr/bin/env python
# coding=utf-8
class Employee(object):
    def __init__(self,first_name,last_name,annual_pay):
        self.first_name = first_name
        self.last_name = last_name
        self.annual_pay = annual_pay

    def give_raise(self,increment = 5000):
        self.annual_pay += increment

