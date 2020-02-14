#!/usr/bin/env python
# coding=utf-8
def describe_city(name,country = 'China'):
    print(name.title() + " is in " + country.title())

describe_city('wuhan')
describe_city('shanghai')
describe_city('beijing')

describe_city('tokyo','japanese')
