/* ADTPriorityQueue LinkedList Implememntation
 *
 * Class    : LLPriorityQueue.java
 * Purpose  : Provides constructor and methods for LLPriorityQueue. Includes
 *            methods enqueue, sortedEnqueue, dequeue and size. Items are
 *            sorted on instertion such that the head is highest priority.          
 * 
 * @author Eric Hepperle
 * Date: 5/3/2016 12:47PM
 */
package LLPriorityQueue;

public class LLPriorityQueue{
    
    private int count;
    private LLPriorityQueueNode head;
    
    public void enqueue(int newItem){
        head = sortedEnqueue(newItem, head);
        count++;
    }
    
    // recursive method inserts new item and returns the head of the PQ 
    private LLPriorityQueueNode sortedEnqueue(int item, LLPriorityQueueNode itemList){
        // itemList empty, reached end of queue, or found position for item
        if((itemList == null)|| (item > itemList.getData())){
            LLPriorityQueueNode newNode = new LLPriorityQueueNode(item, itemList);
            return newNode;
        }else{
            // recursively call on priority queue 
            itemList.setLink(sortedEnqueue(item, itemList.getLink()));
            return itemList;
        }
    }
    
    // removes the head of the queue and sets new head
    public int dequeue(){
        if(head == null){
            return 0;
        }
        LLPriorityQueueNode temp = head;
        head = head.getLink();
        count--;
        return temp.getData();
    }
    
    public int size(){
        return count;
    }
}
