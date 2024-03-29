/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues.Applications.PriorityQueue;

import java.sql.Date;
/**
 *
 * @author assiterk
 */
public class AssignmentLog {
    private PriorityQueueInterface<Assignment> log;
    
    public AssignmentLog ()
    {
        log = new PriorityQueue<Assignment>();
    } // end constructor


    public void addProject (Assignment newAssignment)
    {
        log.add (newAssignment);
    } // end addProject


    public void addProject (String courseCode, String task, Date dueDate)
    {
        Assignment newAssignment = new Assignment (courseCode, task, dueDate);
        addProject (newAssignment);
    } // end addProject


    public Assignment getNextProject ()
    {
        return log.peek ();
    } // end getNextProject


    public Assignment removeNextProject ()
    {
        return log.remove ();
    } // end removeNextProject
}
