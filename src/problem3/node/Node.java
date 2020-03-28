/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

import problem5.student.Student;

public class Node {

    private Student student;

    private Node next;

    public Node(Student student) {
        this.student = student;
        next = null;
    }

    public Node(Student student, Node next) {
        this.student = student;
        this.next = next;
    }


    public Student getData() {
        return student;
    }


    public void setData(Student student) {
        this.student = student;
    }


    public Node getNext() {
        return next;
    }


    public void setNext(Node next) {
        this.next = next;
    }

}
