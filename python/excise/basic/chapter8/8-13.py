#!/usr/bin/env python
# coding=utf-8
def build_profile(first,last,**user_info):
    profile = {}
    profile['first_name'] = first
    profile['last_name'] = last
    for key,value in user_info.items():
        profile[key] = value
    return profile

my_info = build_profile('Wan','Yong',location = 'Peking University',\
                        field = 'Information And Computing Science',\
                       interesting = 'Play basketball')
print(my_info)
