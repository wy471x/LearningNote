#!/usr/bin/env python
# coding=utf-8
def make_album(singer_name,album_name,song_number = 0):
    if song_number != 0:
       album = {'singer' : singer_name ,'album' : album_name,'song' : song_number}
    else:
       album = {'singer' : singer_name ,'album' : album_name}
    return album

while True:
    name  = input("\nPlease enter your favorite singer name: ")
    if name == 'q':
        break
    album = input("\nenter singer's album name: ")
    if album == 'q':
        break
    num = input("\nenter song number: ")
    if num == 'q':
        break
    album = make_album(name,album,num)
    print(album)






