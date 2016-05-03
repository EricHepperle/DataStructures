package ArrayStack;

/* ADTStack Array Implememntation
 *
 * Class    : ArrayStack.java
 * Purpose  : Provides constructor and methods for ArrayStack.
 *            LIFO data structure with push(add element) and pop(remove element)
              methods. Automatically resizes array upon exceeding capacity. 
 * 
 * @author Eric Hepperle
 * Date: 5/2/2016 5:38PM
 */
public class ArrayStack{
    int count;
    int capacity;
    int capacityIncrement;
    
    private Object[] itemArray;
    
    public ArrayStack(){
        count = 0;
        capacity = 10;
        capacityIncrement = 5;
        itemArray = new Object[capacity];
    }
    
    public void push(Object o){
        // check if stack array is full
        if(count == capacity){
            capacity += capacityIncrement;
            Object[] tempArray = new Object[capacity];
            for(int i = 0; i < count; i++){
                tempArray[i] = itemArray[i];
            }
            itemArray = tempArray;
        }
        itemArray[count++] = o;
    } // end push
    
    public Object pop(){
        // check if stack is empty
        if(count <= 0){
            throw new EmptyStackException("Stack is Empty.");
        } else{
        return itemArray[--count];
        }
    } // end pop
    
    public Object peek(){
         // check if stack is empty
        if(count <= 0){
            throw new EmptyStackException("Stack is Empty.");
        } else{
        return itemArray[count-1];
        }
    } // end peek
    
} // end Stack class
