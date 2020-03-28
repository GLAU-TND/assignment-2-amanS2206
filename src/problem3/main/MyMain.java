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
        Student s = new Student(5, "Abc");
        Student s1 = new Student(8, "qasdf");
        Student s2 = new Student(2, "saf");
        Student s3 = new Student(32, "hu");
        Student s4 = new Student(47, "qwe");
        Student s5 = new Student(9, "io");
        Student s6 = new Student(1, "ghf");
        obj.offer(s);
        obj.offer(s1);
        obj.offer(s2);
        obj.offer(s3);
        obj.offer(s4);
        obj.offer(s5);
        obj.offer(s6);
        obj.display();

    }
}
