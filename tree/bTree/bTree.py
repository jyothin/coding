#!/usr/bin/python

# # Properties or Binary Search Tree (BST)
# *left sub-tree of a node has a key <= its parent node's key
# *right sub-tree of a node has a key >= its parent node's key
# *left_subtree(keys) <= node(key) <= right_subtree(keys)

import sys

class Node:
    def __init__(self):
        self.data = None
        self.left = None
        self.right = None

    def getLeft(self):
        return self.left

    def getRigth(self):
        return self.right

    def getData(self):
        return self.data

class BTree:
    def __init__(self):
        self.root = None
        return

    def insert(node):
        if self.root is None:
            self.root = node
            return
        else:
            _root = self.root
            locationFound = False
            while locationFound:
                if node.data < _root.data:
                    if _root.left is not None:
                        _root = _root.left
                    else:
                        locationFound = True
                        _root.left = node
                else:
                    if _root.right is not None:
                        _root = _root.right
                    else:
                        locationFound = True
                        _root.right = node
                

    def search(data):
        found = False
        _root = self.root
        while not found:
            if _root is not None: 
                if data < _root.data:
                    _root = _root.left
                elif data > root.data:
                    _root = _root.right
                else:
                    found = True
            else:
                return None
        return _root

    def inOrder(self):
        #left->root->right
        return

    def preOrder(self):
        #root->left->right
        return

    def postOrder(self):
        #left->right->root
        return
