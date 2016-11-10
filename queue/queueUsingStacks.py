#!/usr/bin/python

import sys
sys.path.append('../stack')
import stack

class Queue:
    def __init__(self):
        self.s1 = stack.Stack()
        self.s2 = stack.Stack()

    def enqueue(self, item):
        self.s1.push(item)

    def dequeue(self):
        while(not self.s1.isEmpty()):
            i = self.s1.pop()
            self.s2.push(i)

        x = self.s2.pop()
        #print('x = %d' %x)

        while(not self.s2.isEmpty()):
            i = self.s2.pop()
            self.s1.push(i)

        return x

    def isEmpty(self):
        return self.s1.isEmpty()

def main(item):
    q = Queue()
    q.enqueue(item)
    print(q.isEmpty())
    print(q.dequeue())
    print(q.isEmpty())

if __name__ == '__main__':
    if len(sys.argv) < 2:
        print('Invalid arguments')
        exit(-1)
    main(int(sys.argv[1]))
