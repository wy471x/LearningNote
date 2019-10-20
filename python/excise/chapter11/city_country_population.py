#!/usr/bin/env python
# coding=utf-8
def City_Country_Population(City,Country,Population = 0):
    if Population != 0:
      city_country_population = City + ',' + Country 
      city_country_population = city_country_population.title() + ' - population ' + str(Population)
    else:
      city_country_population = City + ',' + Country
      city_country_population = city_country_population.title()
    return city_country_population
