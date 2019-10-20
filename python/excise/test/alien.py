#!/usr/bin/env python
# coding=utf-8
alien_0 = {'color':'green','points':5}
print(alien_0['color'])
print(alien_0['points'])

new_points = alien_0['points']
print("You just earned " + str(new_points) + " points!")

alien_0['x_position'] = 0
alien_0['y_position'] = 25
print(alien_0)

alien_1 = {}
alien_1['color'] = 'red'
alien_1['points'] = 30
print(alien_1)

del alien_0['color']
print(alien_0)
