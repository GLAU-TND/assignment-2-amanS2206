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
    private Student stu;
    private Node next;

    public Node(Student stu) {
        this.stu = stu;
        next = null;
    }

    public Student getData() {
        return stu;
    }

    public void setData(Student student) {
        this.stu = student;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
