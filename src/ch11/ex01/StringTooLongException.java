package ch11.ex01;

/**
 * StringTooLongException
 */
public class StringTooLongException extends Exception{

    private static final long serialVersionUID = 1L;

    @Override
    public String getMessage() {
        return "Too long.";
    }
    
}