#!/usr/bin/python

import sys

def insertionSort(llist):
    for i in range (1, len(llist)):
        j = i
        while j > 0 and llist[j-1] > llist[j]:
            temp = llist[j]
            llist[j] = llist[j-1]
            llist[j-1] = temp
            j = j - 1
    return llist

def main(filename):
    try:
        fd = open(filename, 'r')
    except:
        print('Unable to open file')
        exit(-1)

    _llist = fd.read()
    llist = map(lambda x: int(x) , _llist.split())
    llist = insertionSort(llist)
    print(llist)

if __name__ == '__main__':
    if len(sys.argv) < 2:
        print('Invalid arguments')
        exit(-1)
    main(sys.argv[1])
    
