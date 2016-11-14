#!/usr/bin/python

import sys

def selectionSort(llist):
    for i in range(0, len(llist)):
        min_index = i
        for j in range(i+1, len(llist)):
            if llist[j] < llist[min_index]:
                min_index = j
        temp = llist[min_index]
        llist[min_index] = llist[i]
        llist[i] = temp
    return llist

def main(filename):
    try:
        fd = open(filename, 'r')
    except:
        print('Unable to open file')
        exit(-1)
    _llist = fd.read()
    llist = map(lambda x: int(x), _llist.split())
    llist = selectionSort(llist)
    print(llist)

if __name__ == '__main__':
    if len(sys.argv) < 2:
        print('Invalid arguments')
        exit(-1)
    main(sys.argv[1])
