/* ADTPriorityQueue Heap Implememntation
 *
 * Class    : HeapPriorityQueue.java
 * Purpose  : Provides constructor and methods for HeapPriorityQueue.
 *            Priority Queue data structure with enqueue, dequeue and size
 *            methods. Heap is maintained on both enqueue and dequeue
 *            operations.
 * 
 * @author Eric Hepperle
 * Date: 5/3/2016 10:38AM
 */

package HeapPriorityQueue;

public class HeapPriorityQueue {
    private int count;
    private int capacity, capacityIncrement;
    private int[] itemQueue;
    
    public HeapPriorityQueue(){
        count = 0;
        capacity = 16;
        capacityIncrement = 16;
        itemQueue = new int[capacity];
    }
    
    public void enqueue(int newItem){
        // check if itemQueue is full
        if(count == capacity-1){
            capacity += capacityIncrement;
            int[] tempArray = new int[capacity];
            System.arraycopy(itemQueue, 1, tempArray, 1, count);
            itemQueue = tempArray;
        }
        
        int childIndex = count;
        int parentIndex = count/2;
        
        while(parentIndex != 0){
            if(newItem < itemQueue[parentIndex]){
                // newItem is smaller than parent
                itemQueue[childIndex] = newItem;
                return;
            }else{ // newItem is larger and promoted
                itemQueue[childIndex] = itemQueue[parentIndex];
                childIndex = parentIndex;
                parentIndex = childIndex/2;
            }
        }
        // found place for newItem
        itemQueue[childIndex] = newItem;
    } // end method enqueue
    
    public int dequeue(){
        if(count == 0){
            return 0;
        }else{
            int currentIndex = 1;
            int childIndex = currentIndex*2;
            int itemToPlace = itemQueue[count--];
            int itemToReturn = itemQueue[1];
            
            // there is at least 1 child of currentIndex
            while(childIndex <= count){ 
                // promote the larger child to childIndex
                if(childIndex < count){
                    if(itemQueue[childIndex] < itemQueue[childIndex+1])
                        childIndex++;
                }
                // childIndex or itemToPlace will replace currentIndex
                if(itemQueue[childIndex] > itemToPlace){
                    itemQueue[currentIndex] = itemQueue[childIndex];
                    currentIndex = childIndex;
                    childIndex = currentIndex*2;
                }else{
                    itemQueue[currentIndex] = itemToPlace;
                    return itemToReturn;
                }
            } // end while
            itemQueue[currentIndex] = itemToPlace;
            return itemToReturn;
        }
    } // end method dequeue
    
    public int size(){
        return count;
    }
    
} // end class HeapPriorityQueue
