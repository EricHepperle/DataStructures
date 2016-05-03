/* ADTQueue LinkedList Implememntation
 *
 * Class    : LLQueue.java
 * Purpose  : Provides constructor and methods for LLQueue.
 *            FIFO Linked List data structure with enqueue, dequeue and 
              isEmpty methods.
 * 
 * @author Eric Hepperle
 * Date: 5/2/2016 8:52PM
 */
package LLQueue;

/**
 *
 * @author Eric
 */
public class LLQueue {
    
    private LLQueueNode front;
    private LLQueueNode rear;
    private int count;
    
    public LLQueue(){
        count = 0;
    }
    
    public boolean isEmpty(){
        return (count == 0);
    } // end method isEmpty
    
    public void enqueue(Object newItem){
        LLQueueNode tempNode = new LLQueueNode(newItem, null);
        // check if queue is empty
        if(rear == null){
            rear = front = tempNode;
        }else{
            rear.setLink(tempNode);
            rear = tempNode;
        }
        count++;
    } // end method enqueue
    
    public Object dequeue(){
        if(count == 0){
            return null;
        }else{
            Object temp = front.getData();
            front = front.getLink();
            if(front == null){
                rear = null;
            }
            count--;
            return temp;
        }   
    } // end method dequeue
    
} // end class LLQueue
