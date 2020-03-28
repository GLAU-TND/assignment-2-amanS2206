/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

import java.util.ArrayList;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    private int numberOfNodes;
    private TreeNode root;
    public static ArrayList arr;

    public MyBinarySearchTree() {
        this.numberOfNodes = 0;
        this.root = null;
        arr = new ArrayList();
    }

    private TreeNode addRecursive(TreeNode currentNode, int data) {
        if (currentNode == null) {
            return new TreeNode(data);
        }
        if (data < currentNode.getData()) {
            currentNode.leftChild = addRecursive(currentNode.getLeftChild(), data);
        } else if (data > currentNode.getData()) {
            currentNode.rightChild = addRecursive(currentNode.getRightChild(), data);
        }
        return currentNode;
    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        arr.add(root.getData());
        System.out.println(root.getData());
        preOrder(root.getLeftChild());
        preOrder(root.getRightChild());
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.getLeftChild());
        postOrder(root.getRightChild());
        System.out.print(root.getData());
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int size() {
        return numberOfNodes;
    }


    public boolean add(int data) {
        root = addRecursive(root, data);
        numberOfNodes++;
        return true;
    }


}
