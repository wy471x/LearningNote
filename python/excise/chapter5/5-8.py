#!/usr/bin/env python
# coding=utf-8
username = ["admin","lily","kate","luke","dunk","kate"]
login = "erick"
if login in username :
    if login == "admin":
       print("Hello "+ login + ",would you like to see status report?")
    else:
       print("Hello " + login + ",thank you for logging in again!")
else:
    print("user isn't exist!!!")
