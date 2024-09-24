package DesignPatterns.StructuralDesignPatterns.ProxyPattern.Exception;

public class InvalidPassKeyException extends RuntimeException{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public InvalidPassKeyException(String message) {
        super(message);
    }
}
