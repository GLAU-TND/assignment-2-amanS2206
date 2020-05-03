/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;
//executable class

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.ArrayList;

public class MyMain {
    public static void main(String[] args) {
        ArrayList<Student> sl = new ArrayList<Student>();

        sl.add(new Student(14, "Yaf", 0, 0));
        sl.add(new Student(22, "qw", 5, 2));
        sl.add(new Student(34, "ran", 4, 1));
        sl.add(new Student(54, "anshu", 2, 2));
        sl.add(new Student(58, "faine", 0, 0));
        sl.add(new Student(64, " asgag", 2, 1));
        sl.add(new Student(71, "Gasfd", 4, 1));
        sl.add(new Student(12, "gdfgby", 3, 1));
        sl.add(new Student(98, "qer", 0, 0));
        sl.add(new Student(10, "vffga", 2, 0));
        sl.add(new Student(11, "asfg", 1, 1));
        sl.add(new Student(15, "sdfasf", 2, 3));

        MyCircularQueue ob = new MyCircularQueue();
        ob.enqueue(sl);
        ob.display();
    }
}
