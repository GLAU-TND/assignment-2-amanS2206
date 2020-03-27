/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    private int numberOfNodes;
    private TreeNode root;

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
        System.out.println(root.getData());
        preOrder(root.getLeftChild());
        preOrder(root.getRightChild());
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
