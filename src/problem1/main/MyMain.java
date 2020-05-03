/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class
import problem1.mybst.MyBinarySearchTree;

import java.util.Random;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        Random r = new Random();
        int i = r.nextInt(10);
        while (i > 0) {
            bst.add(r.nextInt(100));
            i--;
        }
        bst.LeftChildren(bst.root);
        System.out.println();
        bst.CountNodes(bst.root);

    }
}