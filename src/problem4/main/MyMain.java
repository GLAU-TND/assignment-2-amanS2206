/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

import java.util.Random;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        Random r = new Random();
        int i = r.nextInt(100);
        for (int j = 0; j < i; j++) {
            obj.add(r.nextInt(100));
        }
        MyQueue queue = new MyQueue();
        queue.enqueue(obj.root);
        queue.display();

    }
}
