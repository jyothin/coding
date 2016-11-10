#!/usr/bin/python

import sys

def bubbleSort(llist):
    for i in range(0, len(llist)):
        for j in range(0, len(llist)-i-1):
            if llist[j] > llist[j+1]:
                temp = llist[j]
                llist[j] = llist[j+1]
                llist[j+1] = temp
                swap = True
        if not swap:
            break
    return llist

def main(filename):
    try:
        fd = open(filename, 'r')
    except:
        print('Unable to open file')
        exit(-1)
    _llist = fd.read()
    llist = map(lambda x: int(x), _llist.split())
    print(llist)
    llist = bubbleSort(llist)
    print(llist)

if __name__ == '__main__':
    if len(sys.argv) < 2:
        print('Invalid arguments')
        exit(-1)
    main(sys.argv[1])
