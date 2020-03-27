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
        if ((Integer) data < (Integer) currentNode.getData()) {
            currentNode.leftChild = addRecursive(currentNode.getLeftChild(), data);
        } else if ((Integer) data > (Integer) currentNode.getData()) {
            currentNode.rightChild = addRecursive(currentNode.getRightChild(), data);
        }
        return currentNode;
    }


    public boolean add(int data) {
        root = addRecursive(root, data);
        numberOfNodes++;
        return true;
    }


}
