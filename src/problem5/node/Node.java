/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.node;
import problem5.student.Student;

// to define node properties
public class Node {
    private Student student;
    private Node next;

    public Node(Student stu) {
        this.student = stu;
        next = null;
    }

    public Node(Student student, Node next) {
        this.student = student;

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
