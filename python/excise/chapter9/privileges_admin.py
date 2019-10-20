#!/usr/bin/env python
# coding=utf-8
from user import User

class Privileges():
    def __init__(self,first_name,last_name,*privileges):
        self.privileges = privileges
        self.first_name = first_name
        self.last_name = last_name
        
    def show_privileges(self):
        for privilege in self.privileges:
            print(self.first_name + " " + self.last_name + " "+ privilege + ".")


class Admin(User):
    def __init__(self,first_name,last_name,*infor):
        super(Admin,self).__init__(first_name,last_name,*infor)
        self.privileges = Privileges(self.first_name,self.last_name,\
                                    'can add post','can delete post',\
                                     'can ban user')
