/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.offer(new Student(2, "fas"));
        obj.offer(new Student(5, "iouo"));
        obj.offer(new Student(23, "lkj"));
        obj.offer(new Student(8, "pou"));
        obj.offer(new Student(10, "pu"));
        obj.offer(new Student(30, "qwqer"));
        obj.offer(new Student(22, "yujn"));
        obj.display();

    }
}
