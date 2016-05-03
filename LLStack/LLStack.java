/* ADTStack LinkedList Implememntation
 * 
 * Class    : LLStack.Java
 * Purpose  : Provides constructor and methods for LLStack. LLStack is a
 *            LIFO data structure with push, pop, top, and isEmpty methods.
 * 
 * @author Eric Hepperle
 * Date: 5/2/2016 5:38PM
 */
package LLStack;

public class LLStack<T> {
    public int count;
    public LLStackNode top;
    
    public LLStack(){
        count = 0;
        top = null;
    }
    
    public void push(T newElement){
        LLStackNode<T> newNode = new LLStackNode<>(newElement, top);
        top = newNode;
        count++;
    } // end push
    
    public T pop(){
        if(top == null){
            throw new EmptyStackException("Stack is empty.");
        }
        T temp = (T)top.getData();
        top = top.getLink();
        return temp;
    } // end pop

    public boolean isEmpty(){
        return(top == null);
    } // end isEmpty

}
