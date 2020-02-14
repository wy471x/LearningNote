#!/usr/bin/env python
# coding=utf-8
import unittest
from city_country_population import City_Country_Population

class CityTestCase(unittest.TestCase):
    def test_city_country_population(self):
        city_country_population = City_Country_Population('wuhan','china',1500000)
        self.assertEqual(city_country_population,'Wuhan,China - population 1500000')

unittest.main()
