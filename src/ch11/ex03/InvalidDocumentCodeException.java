package ch11.ex03;

/**
 * StringTooLongException
 */
public class InvalidDocumentCodeException extends Exception {

    private static final long serialVersionUID = 1L;

    @Override
    public String getMessage() {
        return "Not valid.";
    }
    
}