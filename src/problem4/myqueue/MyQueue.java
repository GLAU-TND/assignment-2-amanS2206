/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem1.node.TreeNode;
import problem4.node.Node;

import static problem1.mybst.MyBinarySearchTree.arr;
import static problem1.mybst.MyBinarySearchTree.preOrder;

public class MyQueue {

    private Node rear;

    private Node front;
    private int size;


    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }


    public boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
        }
        return response;
    }


    public void enqueue(TreeNode root) {
        preOrder(root);
        for (int i = 0; i < arr.size(); i++) {
            Node node = new Node(arr.get(i));
            if (front == null) {
                rear = node;
                front = node;
                size++;
            } else {
                rear.setNext(node);
                rear = node;
                size++;
            }

        }

    }

    public void display() {
        Node temp = this.front.getNext();
        for (int i = 0; i < this.size - 1; i++) {
            if (i != this.size - 2) {
                System.out.print(temp.getData() + " --> ");
                temp = temp.getNext();
            } else {
                System.out.println(temp.getData());
            }
        }
    }

    public int getSize() {
        return size;
    }
}
