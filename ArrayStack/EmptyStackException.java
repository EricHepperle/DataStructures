package ArrayStack;

/* ADTStack Array Implememntation
 * 
 * Class    : EmptyStackException.java
 * Purpose  : Provides runtime exception for empty ArrayStack access.
 * 
 * @author Eric Hepperle
 * Date: 5/2/2016 5:38PM
 */
public class EmptyStackException extends RuntimeException{
    public EmptyStackException(String s){
        super(s);
    }
} // end EmptyStackException
