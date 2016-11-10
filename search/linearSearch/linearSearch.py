#!/usr/bin/python

import sys

def findIndex(items, e):
    for i in range(0, len(items)):
        if items[i] == e:
            return i
    return -1

def main(filename, e):
    try:
        fd = open(filename, 'r')
    except:
        print('Unable to open file')
        exit(-1)

    _items = fd.read()
    items = map(lambda x: int(x), _items.split())
    index = findIndex(items, e)
    print(index)

if __name__ == '__main__':
    if len(sys.argv) < 2:
        print('Invalid Inputs')
        exit(-1)
    main(sys.argv[1], int(sys.argv[2]))
