package DesignPatterns.CreationalDesignPatterns.SingletonPattern;

public class SingletonLazyInitializationDemo {
    //Step 1: Declares an Object which is Private and Static
    private static SingletonLazyInitializationDemo singletonLazyInitializationInstance;

    //Step 2: Create a Private Constructor
    private SingletonLazyInitializationDemo() {

    }

    //Step 3: Create a getter to access the one and only object which is READ-ONLY
    public static SingletonLazyInitializationDemo getInstance(){
        if(singletonLazyInitializationInstance == null){
            System.out.println("Creating a new Instance as the existing is null");
            //Step 4: Creates an Object or Instance using a new Keyword only if the instance is null, else it returns the existing instance itself
            singletonLazyInitializationInstance = new SingletonLazyInitializationDemo();
        }
        return singletonLazyInitializationInstance;
    }

    //to print the hashcode value of the instance which is called multiple times, it should be the same, as the object is a static.
    public  void getHashCode(){
        System.out.println("The HashCode value of the object is : " + singletonLazyInitializationInstance.hashCode());
    }
}
