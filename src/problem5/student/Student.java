/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student implements Comparable<Student> {

    private int rollNo;
    private String Name;
    private String backLog;
    private String appearance;


    public Student(int rollNo, String Name) {
        this.rollNo = rollNo;
        this.Name = Name;
    }

    public Student(int rollNo, String Name, String backLog, String appearance) {
        this.rollNo = rollNo;
        this.Name = Name;
        this.backLog = backLog;
        this.appearance = appearance;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBackLog() {
        return backLog;
    }

    public void setLastName(String backLog) {
        this.backLog = backLog;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    @Override
    public String toString() {
        return "RollNo:-" + this.rollNo + " Name:- " + this.getName() + " " + this.getBackLog() + " Section:-" + this.getAppearance();
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.rollNo, o.rollNo);
    }
}
