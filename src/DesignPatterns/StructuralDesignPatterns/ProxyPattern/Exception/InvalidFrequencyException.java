package DesignPatterns.StructuralDesignPatterns.ProxyPattern.Exception;

public class InvalidFrequencyException extends RuntimeException{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public InvalidFrequencyException(String message) {
        super(message);
    }
}
