#!/usr/bin/python

import sys

def partition(llist, left, right):
    pivot = llist[left]
    i = left
    j = right
    while(True):
        while llist[i] < pivot and llist[i] != pivot:
            i = i + 1
        while llist[j] > pivot and llist[j] != pivot:
            j = j - 1
        if i < j:
            temp = llist[j]
            llist[j] = llist[i]
            llist[i] = temp
        else:
            return j

def quickSort(llist, left, right):
    if left < right:
        pivot_index = partition(llist, left, right)
        quickSort(llist, left, pivot_index-1)
        quickSort(llist, pivot_index+1, right)
    return llist

def main(filename):
    try:
        fd = open(filename, 'r')
    except:
        print('Unable to open file')
        exit(-1)
    _llist = fd.read()
    llist = map(lambda x: int(x), _llist.split())
    llist = quickSort(llist, 0, len(llist)-1)
    print(llist)

if __name__ == '__main__':
    if len(sys.argv) < 2:
        print('Invalid arguments')
        exit(-1)
    main(sys.argv[1])
