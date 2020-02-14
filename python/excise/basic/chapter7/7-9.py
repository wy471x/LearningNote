#!/usr/bin/env python
# coding=utf-8
sandwich_orders = ['pastrami sandwich','pastrami sandwich','pastrami sandwich',\
                   'beef sandwich','ham sandwich','bacon sandwich']
finished_orders = []
print("pastrami sales out!!!")
while 'pastrami sandwich' in sandwich_orders:
    sandwich_orders.remove('pastrami sandwich')

while sandwich_orders:
    sandwich = sandwich_orders.pop()
    print("I made your " + sandwich + ".")
    finished_orders.append(sandwich)

print("\nAll sandwich are as follows:")
for sandwich in finished_orders:
    print(sandwich)
