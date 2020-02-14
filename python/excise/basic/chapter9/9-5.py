#!/usr/bin/env python
# coding=utf-8
class User(object):
    def __init__(self,first_name,last_name,*infor):
        self.first_name = first_name
        self.last_name = last_name
        self.infor = infor
        self.login_attempts = 0

    def describe_user(self):
        print(self.first_name + ' ' + self.last_name)
        for item in self.infor:
            print(item)
        print(self.login_attempts)

    def greet_user(self):
        print("Hello,"+ self.first_name +' '+ self.last_name + '.')
    
    """递增login_attempts"""
    def increment_login_attempts(self,attempts):
        self.login_attempts += attempts
    
    """重置login_attempts"""
    def reset_login_attempts(self):
        self.login_attempts = 0


user1 = User('Wan','Yong','play basketball')
user1.describe_user()
user1.increment_login_attempts(20)
user1.describe_user()
user1.increment_login_attempts(20)
user1.describe_user()
user1.increment_login_attempts(20)
user1.describe_user()
user1.reset_login_attempts()
user1.describe_user()
