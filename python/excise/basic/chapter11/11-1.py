#!/usr/bin/env python
# coding=utf-8
import unittest
from city_functions import City_Functions

class City_FunctionsTestCase(unittest.TestCase):
    def test_City_Functions(self):
        city_country = City_Functions('wuhan','china')
        self.assertEqual(city_country,'Wuhan China')

unittest.main()
