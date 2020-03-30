/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    private int numberOfNodes;
    public TreeNode root;
    public static ArrayList<Integer> arr;
    public static ArrayList<Integer> arr1;
    static Queue<TreeNode> myQueue;
    public int count;

    public MyBinarySearchTree() {
        this.numberOfNodes = 0;
        this.root = null;
        arr = new ArrayList();
        arr1 = new ArrayList<>();
    }

    public static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.getLeftChild());
        postOrder(root.getRightChild());
        arr1.add(root.getData());
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
        preOrder(root.getLeftChild());
        preOrder(root.getRightChild());
    }

    public void LeftChildren(TreeNode root) {
        myQueue = new LinkedList<TreeNode>();
        if (root == null) {
            return;
        }
        myQueue.add(root);
        myQueue.add(null);
        while (myQueue.size() > 0) {
            TreeNode temp = myQueue.peek();
            if (temp != null) {
                System.out.print(temp.getData() + " ");
                while (myQueue.peek() != null) {

                    if (temp.getLeftChild() != null)
                        myQueue.add(temp.getLeftChild());

                    if (temp.getRightChild() != null) {
                        myQueue.add(temp.getRightChild());
                    }
                    myQueue.remove();
                    temp = myQueue.peek();
                }
                myQueue.add(null);
            }
            myQueue.remove();

        }

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

    public void CountNodes(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int count = 0;
        while (queue != null) {
            TreeNode temp = queue.poll();
            if (temp == null) {
                break;
            }
            if (temp.getLeftChild() == null)
                count++;
            if (temp.getLeftChild() != null)
                queue.add(temp.getLeftChild());
            if (temp.getRightChild() != null)
                queue.add(temp.getRightChild());
        }
        System.out.println("number of nodes which does not have left children: " + count);
    }
}
