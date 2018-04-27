class Node(object):
    def __init__(self,data):
        self.data = data;
        self.height = 0;
        self.leftChild = None;
        self.rightChild = None;

class AVL(object):
    def __init__(self):
        self.root = None

    def calculateHeight(self,node):
        if not node:
            return -1;
        return node.height;

    def clculateBalance(self,node):
        if not node:
            return 0
        return self.calculateHeight(node.leftChild)-self.calculateHeight(node.rightChild)

    def rotateRight(self,node):
        print("Rotating to right one child ",node.data)

        tempLeftChild = node.leftChild;
        t = tempLeftChild.leftChild;

        tempLeftChild.rightChild = node

