#!/usr/bin/env python
# coding=utf-8
def city_country(city,country):
    res = city + ',' + country
    return res.title()

formatted_txt = city_country('wuhan','china')
print(formatted_txt)
