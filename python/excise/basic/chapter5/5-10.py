#!/usr/bin/env python
# coding=utf-8
current_users = ["Mike","Lily","Bryant","Lule","Dunk"]
new_users = ["Dunk","Lule","Wade","Frank","Sara"]
for user in new_users:
    if user in current_users:
        print(user  + " has been used!please input other name.")
    else:
        print(user + " isn't used!")
