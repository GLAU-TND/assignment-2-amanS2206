/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

import java.util.ArrayList;

//to implement circular queue
public class MyCircularQueue {
    private Node rear;
    private int size;

    public MyCircularQueue() {
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(ArrayList<Student> arrayList) {
        for (Student s : arrayList) {
            if (s.getBackLog() - s.getAppearance() > 0) {
                if (s.getAppearance() < 3 && s.getBackLog() != 0) {
                    Node node = new Node(s);
                    if (rear == null) {
                        rear = node;
                        size++;
                        node.setNext(node);
                    } else {
                        node.setNext(rear.getNext());
                        rear.setNext(node);
                        rear = node;
                        size++;
                    }
                }
            }
        }
    }


    public void display() {
        Node temp = this.rear;
        for (int i = 0; i < this.size; i++) {
            if (i != this.size - 1) {
                System.out.print("Roll NO:  " + temp.getData().getRollNo() + "  Name:  " + temp.getData().getName() + "     Backlog: " + temp.getData().getBackLog() + "    Apearence: " + temp.getData().getAppearance());
                System.out.println();
                temp = temp.getNext();
            } else {
                System.out.println("Roll NO:  " + temp.getData().getRollNo() + "  Name:  " + temp.getData().getName() + "   Backlog: " + temp.getData().getBackLog() + "    Apearence: " + temp.getData().getAppearance());
            }
        }
    }


}
