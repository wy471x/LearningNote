#!/usr/bin/env python
# coding=utf-8
favorite_language = {'jen':'python','sarah':'c','edward':'ruby','phil':'python'\
                     ,'kobe':'lua'}
print(favorite_language)

print("sarah's favorite language is " + favorite_language['sarah'].title() + ".")

print("The following languages have been mentioned:")

for language in set(favorite_language.values()):
    print(language.title())
