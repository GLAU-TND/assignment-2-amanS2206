/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Random;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            bst.add(r.nextInt(100));
        }
        MyBinarySearchTree.preOrder(bst.root);
        MyBinarySearchTree.postOrder(bst.root);
        System.out.println("Pre-Order traversing :");
        System.out.println(MyBinarySearchTree.arr);
        System.out.println("Post-Order traversing :");
        System.out.println(MyBinarySearchTree.arr1);
    }
}

