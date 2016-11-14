#!/usr/bin/python

class ListNode:
    def __init__(self, x):
        self.data = x
        self.nex = None

class Solution:
    def mergeSorted(self, l1, l2):
        output = ListNode(0)
        head = output
        while l1 != None and l2 != None:
            if l1.data < l2.data:
                head.nex = l1
                l1 = l1.nex
            else:
                head.nex = l2
                l2 = l2.nex
            head = head.nex
            
            if l1 == None:
                head.nex = l2
            else:
                head.nex = l1
            return output.nex

