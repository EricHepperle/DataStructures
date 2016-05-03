/* ADTPriorityQueue Array Implememntation
 *
 * Class    : ArrayPriorityQueue.java
 * Purpose  : Provides constructor and methods for ArrayPriorityQueue.
 *            Priority Queue data structure with enqueue, dequeue and size
*             methods. Simple end of the array enqueue, priority handled on dequeue.
 * 
 * @author Eric Hepperle
 * Date: 5/3/2016 10:38AM
 */

package ArrayPriorityQueue;

public class ArrayPriorityQueue {
    private int count;
    private int capacity, capacityIncrement;
    private int[] itemArray;
    
    public ArrayPriorityQueue(){
        count = 0;
        capacity = 10;
        capacityIncrement = 10;
        itemArray = new int[capacity];
    }
    
    public void enqueue(int newItem){
        //  check if array is full
        if(count == capacity){
            capacity += capacityIncrement;
            int[] tempArray = new int[capacity];
            System.arraycopy(itemArray, 0, tempArray, 0, count);
            itemArray = tempArray;
        }
        itemArray[count++] = newItem;
    } // end method enqueue
    
    public int dequeue(){
        // check if array is empty
        if(count == 0){
            return 0;
        }else{
            int maxIndex = 0;
            int maxItem = itemArray[maxIndex];
            for(int i = 1; i < count; i++){
                if(itemArray[i] > maxItem){
                    maxIndex = i;
                    maxItem = itemArray[i];
                }
            }
            // fill gap left by maxItem with last element in array
            itemArray[maxIndex] = itemArray[--count];
            return maxItem;
        }
    } // end method dequeue
    
    public int size(){
        return count;
    }
    
}
