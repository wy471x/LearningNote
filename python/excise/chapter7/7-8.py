#!/usr/bin/env python
# coding=utf-8
sandwich_orders = ['beef sandwich','ham sandwich','bacon sandwich']
finished_orders = []

while sandwich_orders:
    sandwich = sandwich_orders.pop()
    print("I made your " + sandwich + ".")
    finished_orders.append(sandwich)

print("\nAll sandwich are as follows:")
for sandwich in finished_orders:
    print(sandwich)
