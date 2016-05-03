/* ADTQueue Circular Array Implememntation
 *
 * Class    : ArrayQueue.java
 * Purpose  : Provides constructor and methods for ArrayQueue.
 *            FIFO circular array data structure with enqueue and dequeue 
 *            methods. Automatically resizes array upon exceeding capacity or 
 *            reaching less than half capacity.
 * 
 * @author Eric Hepperle
 * Date: 5/2/2016 8:07PM
 */

package ArrayQueue;

public class ArrayQueue {
    private int count;
    private int capacity, capacityIncrement;
    private int front, rear;
    private Object[] itemArray;
    
    public ArrayQueue(){
        front = 0;
        rear = 0;
        count = 0;
        capacity = 10;
        capacityIncrement = 10;
        itemArray = new Object[capacity];
    }
    
    public void enqueue(Object newItem){
        
        // arrayQueue is at capacity
        if(count == capacity){
            capacity += capacityIncrement;
            Object[] tempArray = new Object[capacity];
            // determine the migration of itemArray to tempArray
            if(front < rear){
                for(int i = 0; i < count; i++){
                    tempArray[i] = itemArray[i];
                }
            } else {
                for(int i = 0; i < rear; i++){
                    tempArray[i] = itemArray[i];
                }
                for(int i = front; i < count; i++){
                    tempArray[i+capacityIncrement] = itemArray[i];
                }
                front += capacityIncrement;
            }
            itemArray = tempArray;
        }
        // arrayQueue is less than capacity
        itemArray[rear] = newItem;
        rear = (rear+1) % capacity;
        count++;    
    } // end enqueue
    
    public Object dequeue(){
        // first check if queue is empty
        if(count == 0){
            return null;
        }else{
            Object tempItem = front;
            front = (front+1) % capacity;
            count--;
            return tempItem;
        }
    }
}
