/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Assignment 04 - Priority Queue
 * A&E Patient priority queue and heap application
 * for Algorithms and Data Structures - LIT
 * @author k00223361 VINCENT LEE [DragonDream]
 */
public class Patient {
    
    private int patientID;
    private String patientName;
    private int priority;

    //getters and setters
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    // constructor
    public Patient(String patientName, int priority) {
        this.patientName = patientName;
        this.priority = priority;
    }
    
    @Override
    public String toString(){
        return "\nPatient Name:" + this.patientName + "\t priority : " + this.priority + " is waiting... " + "\n";
    }
    
}
