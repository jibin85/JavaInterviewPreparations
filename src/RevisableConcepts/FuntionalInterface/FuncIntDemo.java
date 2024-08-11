package RevisableConcepts.FuntionalInterface;

public class FuncIntDemo {
    
    public static void main(String[] args) {
        FunctionalInterface functionalInterface = (a, b) -> a*b;
        System.out.println("Value : "+functionalInterface.multiply(5,10));
    }
    
}
