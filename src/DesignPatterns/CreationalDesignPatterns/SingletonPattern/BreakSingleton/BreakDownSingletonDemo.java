package DesignPatterns.CreationalDesignPatterns.SingletonPattern.BreakSingleton;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//Step 2: Create a Private Constructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BreakDownSingletonDemo implements Cloneable , Serializable {
    
    //Step 1: Creates an Object which is Private and Static
    private static BreakDownSingletonDemo singletonEarlyInitializationInstance =
            new BreakDownSingletonDemo();
    
    //Step 3: Create a getter to access the one and only object which is READ-ONLY
    public static BreakDownSingletonDemo getInstance(){
        return singletonEarlyInitializationInstance;
    }
    
    //to print the hashcode value of the instance which is called multiple times, it should be the same, as the object is a static.
    public  void getHashCode(){
        System.out.println("The HashCode value of the object is : " + singletonEarlyInitializationInstance);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
