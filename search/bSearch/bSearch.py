#!/usr/bin/python

import sys
import math
sys.path.append('../../sorting/heapSort')
import heapSort

def bSearch(items, e, start, end):
    if start > end:
        return -1
    middle = int(math.floor((start + end) / 2))
    #print(items, e, start, end)
    item = items[middle]
    if item > e:
        return bSearch(items, e, start, middle-1)
    if item < e:
        return bSearch(items, e, middle+1, end)
    return middle

def findIndex(items, e):
    return bSearch(items, e, 0, len(items)-1)

def main(filename, e):
    try:
        fd = open(filename, 'r')
    except:
        print('Unable to open file')
        exit(-1)
    _items = fd.read()
    items = map(lambda x: int(x), _items.split())
    items = heapSort.heapSort(items)
    print('Sorted list = %s' %items)
    index = findIndex(items, e)
    print(index)

if __name__ == '__main__':
    if len(sys.argv) < 3:
        print('Invalid arguments')
        exit(-1)
    main(sys.argv[1], int(sys.argv[2]))
