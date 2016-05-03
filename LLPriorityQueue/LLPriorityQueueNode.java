/* ADTPriorityQueue LinkedList Implememntation
 *
 * Class    : LLPriorityQueue.java
 * Purpose  : Provides constructor and access methods for LLPriorityQueueNode.       
 * 
 * @author Eric Hepperle
 * Date: 5/3/2016 12:47PM
 */
package LLPriorityQueue;

public class LLPriorityQueueNode{
    private int data;
    private LLPriorityQueueNode link;
    
    public LLPriorityQueueNode(){
        this(0, null);
    }
    
    public LLPriorityQueueNode(int d, LLPriorityQueueNode l){
        data = d;
        link = l;
    }
    
    public void setData(int d){
        data = d;
    }
    
    public void setLink(LLPriorityQueueNode l){
        link = l;
    }
    
    public int getData(){
        return data;
    }
    
    public LLPriorityQueueNode getLink(){
        return link;
    }
}
