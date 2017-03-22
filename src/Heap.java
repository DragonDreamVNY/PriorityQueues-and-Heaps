
import java.util.Arrays;
/**
 * Assignment 04 - Priority Queue
 * A&E Patient priority queue and heap application
 * for Algorithms and Data Structures - LIT
 * @author k00223361 VINCENT LEE [DragonDream]
 */

/*'Maximum heap'
    Heaps are complete binary trees (shape property)
    each node's keys >= than the keys of its children (order property) from parent to left child to right child.
    root node will always be the largest number or highest priority (lowest index = 0) node.
    each node conains a key
    root can beswitched in the priority queue with the Heap's rule that 
    -----
    in this application, root is the highest priority Patient to be seen next (deQueue).
    removing the root requires a replacement and a Reheap Down method
    adding a patient requires a Reheap Up method, taking into account the other patients (nodes) and their keys (priority).
    
    insert and remove operations modify the heap to conform to the shape property first, by adding 
    or removing from the end of the heap
*/


public class Heap {
    // Array holds heap's elements (instances of patients from the Patient object class)
    protected static Patient[] patientsWaitingArr;  //private char[] elements;  //need static for access 
    private int numPatients;  //private int numElements; 
    
    private Patient data;
    private static String output = "";
    
    // Constructor
    public Heap(int maxSize) {
        patientsWaitingArr = new Patient[maxSize]; //elements = new char[maxSize];
        numPatients = maxSize; //numElements = maxSize;
    }
    
    /*--- getter and setter for output String to be accessed by GUI ---*/
    public static String getOutput() { return output; }
    public static void setOutput(String output) { Heap.output = output; }
    
    /*=============================*/
    /*       Reheap functions      */
    /*=============================*/

    // Function: Restores the order property of heap to the tree between root and bottom.
    // Pre: The order property of heaps is satisfied from the root of the heap through the next-to-last node; the last (bottom) node may violate the order property. 
    // Post: The order property applies to all elements of the heap from root through bottom
    public void reheapUp(int root, int bottom) {
    	int parent;
    	if (bottom > root) {
            parent = (bottom-1) / 2; //set parent to index of bottom node 
            if ( patientsWaitingArr[parent].getPriority() < patientsWaitingArr[bottom].getPriority() ) { //if (elements[parent] < elements[bottom])
                Swap(patientsWaitingArr, parent, bottom); //Swap(elements, parent, bottom);
                reheapUp(root, parent);
            }
    	}
    }// end of ReheapUp
    
    
    public void reheapDown(int root, int bottom) {
    	int maxChild;
    	int rightChild;
    	int leftChild;
    	leftChild = root * 2+1;
    	rightChild = root * 2+2;
    	if (leftChild <= bottom) {
            if (leftChild == bottom){
                maxChild = leftChild;
            }
            else {	
                if (patientsWaitingArr[leftChild].getPriority() <= patientsWaitingArr[rightChild].getPriority()){
                    maxChild = rightChild;
                } else{
                    maxChild = leftChild;
                }
            }
            if (patientsWaitingArr[root].getPriority() < patientsWaitingArr[maxChild].getPriority()) { 
                Swap(patientsWaitingArr, root, maxChild); //Swap(elements, root, maxChild);
                reheapDown(maxChild, bottom); //ReheapDown(maxChild, bottom);
            }
        }
        
    }// end of ReheapDown
    
    /*-----------*/
    /*Swap method*/
    /*-----------*/
    private static void Swap(Patient[] arr, int i, int j) {
        Patient temp = arr[i];
        arr[i] = arr[j]; 
        arr[j] = temp;
        System.out.println( Arrays.toString(arr) ); // print array passed in
//        System.out.println(java.util.Arrays.toString(intArray));
     }// end swap
    
    
} // end Heap Class
