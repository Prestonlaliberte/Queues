/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues.Applications.PriorityQueue;

import java.util.Date;
/**
 *
 * @author assiterk
 */
public class Assignment implements Comparable<Assignment> {
    private String courseCode;
    private String task;
    private Date dueDate;
    
    public Assignment(String inC,String inT, Date inD) {
        setCourseCode(inC);
        setTask(inT);
        setDueDate(inD);
    }
    
    public String getCourseCode() { return courseCode; }
    public String getTask() { return task; }
    public Date getDueDate() { return dueDate; }
    
    public void setCourseCode(String inC) { courseCode = inC; }
    public void setTask(String inT) { task=inT; }
    public void setDueDate(Date inD) {  dueDate = inD; }
    
    @Override
    public String toString() {
        return "Course code: " + courseCode + " Task " + task + " Due Date: " + dueDate;
    }
    
    public int compareTo(Assignment inA) {
        Assignment ass = inA;
        if (courseCode.equals(ass.getCourseCode()) && 
           (task.equals(ass.getTask())) && dueDate.equals(ass.getDueDate()))     
            return 0;
        else
            return 1;
    }
    public static void main(String[] args) {
        Date d = new Date(1,1,1);
        System.out.println(d);
        Assignment a = new Assignment("comp310", "A1",d);
        System.out.println(a);
       
    }

   
}
