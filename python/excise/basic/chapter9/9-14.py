#!/usr/bin/env python
# coding=utf-8
from random import randint

class Die():
    def __init__(self,sides = 6):
        self.sides = sides

    def roll_die(self):
        print(randint(1,self.sides))


die = Die()
die.roll_die()
die.roll_die()
die.roll_die()
die.roll_die()
die.roll_die()
die.roll_die()
die.roll_die()
die.roll_die()
die.roll_die()
die.roll_die()
print("\n")
die2 = Die(10)
die2.roll_die()
die2.roll_die()
die2.roll_die()
die2.roll_die()
die2.roll_die()
die2.roll_die()
die2.roll_die()
die2.roll_die()
die2.roll_die()
die2.roll_die()
print("\n")
die3 = Die(20)
die3.roll_die()
die3.roll_die()
die3.roll_die()
die3.roll_die()
die3.roll_die()
die3.roll_die()
die3.roll_die()
die3.roll_die()
die3.roll_die()
die3.roll_die()
