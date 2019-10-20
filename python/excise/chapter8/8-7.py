#!/usr/bin/env python
# coding=utf-8
def make_album(singer_name,album_name,song_number = 0):
    if song_number != 0:
       album = {'singer' : singer_name ,'album' : album_name,'song' : song_number}
    else:
       album = {'singer' : singer_name ,'album' : album_name}
    return album

album = make_album('Zhou jielun','说好不哭',10)
print(album)

album = make_album('Lin junjie','东风破',25)
print(album)

album = make_album('Taylor Swift','Lover')
print(album)
