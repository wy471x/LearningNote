#!/usr/bin/env python
# coding=utf-8
dream_places = {}

polling_active = True

while polling_active:
      name = input("\n What is your name? ")
      place = input("\n If you could visit one place in the world,where would you go? ")

      dream_places[name] = place;
      repeat = input("Would you like to let another person respond?(yes / no)")
      if repeat == 'no':
          polling_active = False

print("\n--- Poll Results ---")
for name,place in dream_places.items():
    print(name + " would go to visit " + place  + ".")
