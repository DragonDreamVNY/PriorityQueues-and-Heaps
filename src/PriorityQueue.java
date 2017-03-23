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
 * a max heap priority queue
 */
public class PriorityQueue {
    private int numPatients;  //numItems
    private Heap patientsHeap; //items
    private int maxNumberOfPatients; //maxItems
	
    public int size(){ 
        return numPatients;
    }
    
    //constructor for PQ initialise
    public PriorityQueue(int max) {
        patientsHeap = new Heap(max); //items new Heap(max);
        maxNumberOfPatients = max; //maxItems = max;
        numPatients = 0; //numItems = 0;
    }
    
    
    public void makeEmpty( ) { numPatients = 0; }

    //1. Add the element to the bottom level of the heap (a 'leaf').
    //2. Compare the added element with its parent; if they are in the correct order, stop.
    //3. If not, swap the element with its parent and return to the previous step.
        // Function: Add newItem to the queue. 
	// PreCondition: Queue is not full
	// PostCondition: newItem is in the queue 
    public void enQueue (Patient newPatient) { // 'insert' new instance of Patient
        numPatients++; // numItems + 1 slots of the array are filled
        patientsHeap.patientsWaitingArr[numPatients -1] = newPatient; // items.elements[numItems-1] = newItem; //put new item in next available slot or Remove root element
        patientsHeap.reheapUp(0, numPatients -1); // fix the order
        System.out.println("Added new Patient in Queue : " + newPatient.getPatientName());
    }
    
    
    // Finds the current minimum element (highest priority at index [0]) AKA 'root' in
    // the queue, deletes it from the queue, and returns it 
    // Post: element with highest priority has been removed
    // from the queue; a copy is returned from the method in item
    public void deQueue (Patient nextPatient) { // public void deQueue (int item)
        nextPatient = patientsHeap.patientsWaitingArr[0]; // remove root element  //item = items.elements[0];
        patientsHeap.patientsWaitingArr[0] = patientsHeap.patientsWaitingArr[numPatients -1]; //last node is always (number of elements) - 1
        numPatients--;
        patientsHeap.reheapDown(0, numPatients-1);
    }

    
    public boolean isFull ( ) {
        // Post: Function value = true if the queue is full; false otherwise
	return numPatients == maxNumberOfPatients;
    }
	
    public boolean isEmpty ( ) {
        // Post: Function value = true if the queue is empty; false otherwise
        return numPatients == 0;
    }
    
    
    public String printQueue(){
        String output = "";
        
        for (int i =0; i < numPatients; i++){
            output += patientsHeap.patientsWaitingArr[i];
        }
        return output;
    }
    
    // returns name of root (the top priority Patient)
    public String nextPriority(){
        String topPriority = "";
        topPriority = patientsHeap.patientsWaitingArr[0].getPatientName();
        
        return topPriority;
    }
    
}// end PQ Class
