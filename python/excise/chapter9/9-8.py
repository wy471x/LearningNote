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
        

admin = Admin("wan","yong","play basketball")
admin.describe_user()
admin.privileges.show_privileges()
