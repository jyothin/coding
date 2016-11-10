#!/usr/bin/python

import sys
import math

def merge(llist, left, p, right):
    print('left = %d, p = %d, right = %d' %(left, p, right))
    i = left
    j = p + 1
    k = 0
    temp = []
    for t in range(0, len(llist)):
        temp.append('')
    while i <= p and j <= right:
        if llist[i] < llist[j]:
            #temp.append(llist[i])
            temp[k] = llist[i]
            i += 1
        else:
            #temp.append(llist[j])
            temp[k] = llist[j]
            j += 1
        k += 1
    while i <= p:
        #temp.append(llist[i])
        temp[k] = llist[i]
        k += 1
        i += 1
    while j <= right:
        #temp.append(llist[j])
        temp[k] = llist[j]
        k += 1
        j += 1
    print(temp, llist)
    for l in range(right, p-1, -1):
        k -= 1
        llist[l] = temp[k]
    print(temp, llist)

def mergeSort(llist, left, right):
    print('left = %d, right = %d' %(left, right))
    if left < right:
        p = int(math.floor((left+right)/2))
        p = (left+(right-1))/2
        mergeSort(llist, left, p)
        mergeSort(llist, p+1, right)
        merge(llist, left, p, right)
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
    llist = mergeSort(llist, 0, len(llist)-1)
    print(llist)

if __name__ == '__main__':
    if len(sys.argv) < 2:
        print('Invalid arguments')
        exit(-1)
    main(sys.argv[1])
