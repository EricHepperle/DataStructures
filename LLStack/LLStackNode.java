/* ADTStack Array Implememntation
 * 
 * Class    : LLSTackNode.java
 * Purpose  : Provides constructor and access methods for LLStackNode.
 * 
 * @author Eric Hepperle
 * Date: 5/2/2016 5:38PM
 */

package LLStack;

/**
 *
 * @author Eric
 */
public class LLStackNode <T>{
    private T data;
    private LLStackNode<T> link;
    
    public LLStackNode(){
        this(null, null);
    }
    
    public LLStackNode(T d, LLStackNode<T> l){
        data = d;
        link = l;
    }
    
    public void setData(T d){
        data = d;
    }
    
    public void setLink(LLStackNode<T> l){
        link = l;
    }
    
    public T getData(){
        return data;
    }
    
    public LLStackNode<T> getLink(){
        return link;
    }
}
