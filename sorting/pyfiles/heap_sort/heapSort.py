#!/usr/bin/python

import sys

def satisfyHeap(llist, root, heap_size):
    left = 2 * root
    right = 2 * root + 1
    if left <= heap_size and llist[left] > llist[root]:
        largest = left
    else:
        largest = root
    if right <= heap_size and llist[right] > llist[largest]:
        largest = right
    if largest != root:
        llist[root], llist[largest] = llist[largest], llist[root]
        satisfyHeap(llist, largest, heap_size)

def buildHeap(llist, size):
    heap_size = size - 1
    for i in range(size/2, -1, -1):
        satisfyHeap(llist, i, heap_size)

def heapSort(llist):
    buildHeap(llist, len(llist))

    heap_size = len(llist) - 1
    for i in range(heap_size, -1, -1):
        llist[0], llist[heap_size] = llist[heap_size], llist[0]
        heap_size -= 1
        satisfyHeap(llist, 0, heap_size)

    return llist

def main(filename):
    try:
        fd = open(filename, 'r')
    except:
        print('Unable to open file')
        exit(-1)
    _llist = fd.read()
    llist = map(lambda x: int(x), _llist.split())
    llist = heapSort(llist)
    print(llist)

if __name__ == '__main__':
    if len(sys.argv) < 2:
        print('Invalid arguments')
        exit(-1)
    main(sys.argv[1])
