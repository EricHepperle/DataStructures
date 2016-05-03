/* ADTQueue LinkedList Implememntation
 *
 * Class    : LLQueueNode.java
 * Purpose  : Provides constructor and access methods for ArrayQueueNode.
 * 
 * @author Eric Hepperle
 * Date: 5/2/2016 8:52PM
 */
package LLQueue;

public class LLQueueNode {
    
    private Object data;
    private LLQueueNode link;
    
    public LLQueueNode(){
        this(null, null);
    }
    
    public LLQueueNode(Object o, LLQueueNode l){
        data = o;
        link = l;
    }
    
    public void setData(Object o){
        data = o;
    }
    
    public void setLink(LLQueueNode l){
        link = l;
    }
    
    public Object getData(){
        return data;
    }
    
    public LLQueueNode getLink(){
        return link;
    }
} // end class LLQueneNode
