#!/usr/bin/env python
# coding=utf-8
class User(object):
    def __init__(self,first_name,last_name,*infor):
        self.first_name = first_name
        self.last_name = last_name
        self.infor = infor
    def describe_user(self):
        print(self.first_name + ' ' + self.last_name)
        for item in self.infor:
            print(item)
    def greet_user(self):
        print("Hello,"+ self.first_name +' '+ self.last_name + '.')

user1 = User('Wan','Yong','play basketball')
user1.describe_user()
user1.greet_user()
user2 = User('Wan','Bei','play football')
user2.describe_user()
user2.greet_user()
user3 = User('Wang','Qin','play tennis')
user3.describe_user()
user3.greet_user()
