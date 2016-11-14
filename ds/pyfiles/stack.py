#!/usr/bin/python

import sys

class Stack:
    def __init__(self):
        self._top = -1
        self._size = 100
        self.stack = []
        for i in range(0, self._size):
            self.stack.append('')

    def push(self, item):
        if self._top >= self._size:
            print('Stack overflow')
        else:
            self._top += 1
            self.stack[self._top] = item
            print('Item inserted')

    def pop(self):
        if self._top < 0:
            print('Stack underflow')
            item = None
        else:
            item = self.stack[self._top]
            self._top -= 1
        return item

    def isEmpty(self):
        if self._top < 0:
            return True
        else:
            return False

def main(item):
    s = Stack()
    s.push(item)
    s.push(11)
    print(s.isEmpty())
    print(s.pop())
    print(s.isEmpty())

if __name__ == '__main__':
    if len(sys.argv) < 2:
        print('Invalid arguments')
        exit(-1)
    main(sys.argv[1])
