#!/usr/bin/python

import sys

class Queue:
    def __init__(self):
        self._size = 100
        self.stack = []
        for i in range(0, self._size):
            self.stack.append('')
        self.tail = self.head = -1

    def enqueue(self, item):
        if self.tail == self._size-1:
            print('Queue is full')
        else:
            print('Enqueuing %d' %item)
            self.stack[self.tail] = item
            self.tail += 1

    def dequeue(self):
        item = self.stack[self.head]
        self.head += 1
        return item

    def isEmpty(self):
        if self.head != self.tail:
            return False
        else:
            return True

    def show(self):
        for i in range(self.head, self.tail):
            print(self.stack[i],)

def main(item):
    q = Queue()
    q.enqueue(item)
    q.show()
    print(q.isEmpty())
    print(q.dequeue())
    print(q.isEmpty())

if __name__ == '__main__':
    if len(sys.argv) < 2:
        print('Invalid arguments')
        exit(-1)
    main(int(sys.argv[1]))
