package DesignPatterns.CreationalDesignPatterns.SingletonPattern;

public class SingletonEarlyInitializationDemo {
    
    //Step 1: Creates an Object which is Private and Static
    private static SingletonEarlyInitializationDemo singletonEarlyInitializationInstance =
            new SingletonEarlyInitializationDemo();
    
    //Step 2: Create a Private Constructor
    private SingletonEarlyInitializationDemo() {

    }
    
    //Step 3: Create a getter to access the one and only object which is READ-ONLY
    public static SingletonEarlyInitializationDemo getInstance(){
        return singletonEarlyInitializationInstance;
    }
    
    //to print the hashcode value of the instance which is called multiple times, it should be the same, as the object is a static.
    public  void getHashCode(){
        System.out.println("The HashCode value of the object is : " + singletonEarlyInitializationInstance.hashCode());
    }
}
