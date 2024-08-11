package DesignPatterns.CreationalDesignPatterns.SingletonPattern;

import DesignPatterns.CreationalDesignPatterns.SingletonPattern.BreakSingleton.BreakDownSingletonDemo;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonPatternMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
        System.out.println("------------------------------SINGLETON PATTERN------------------------------");
        earlyInitialization();
        lazyInitialization();
        System.out.println("\n-------------------------WAYS TO BREAK DOWN SINGLETON PATTERN-------------------------");
        usingReflection();
        usingSerialization();
        usingCloning();
    }

    private static void earlyInitialization() {
        System.out.println("--------------------EARLY INITIALIZATION--------------------");
        //Gets the object which is defines as private static field and Stores in singletonEarlyInitializationObject1
        SingletonEarlyInitializationDemo singletonEarlyInitializationObject1 =
                SingletonEarlyInitializationDemo.getInstance();
        singletonEarlyInitializationObject1.getHashCode();

        //Gets the object which is defines as private static field and Stores in singletonEarlyInitializationObject2
        SingletonEarlyInitializationDemo singletonEarlyInitializationObject2 =
                SingletonEarlyInitializationDemo.getInstance();
        singletonEarlyInitializationObject2.getHashCode();
    }


    private static void lazyInitialization() {
        System.out.println("\n--------------------LAZY INITIALIZATION---------------------");
        //Gets the object which is defines as private static field and Stores in singletonEarlyInitializationObject1
        SingletonLazyInitializationDemo singletonLazyInitializationObject1 =
                SingletonLazyInitializationDemo.getInstance();
        singletonLazyInitializationObject1.getHashCode();

        //Gets the object which is defines as private static field and Stores in singletonEarlyInitializationObject2
        SingletonLazyInitializationDemo singletonLazyInitializationObject2 =
                SingletonLazyInitializationDemo.getInstance();
        singletonLazyInitializationObject2.getHashCode();
    }

    private static void usingReflection() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        System.out.println("--------------------USING REFLECTIONS---------------------");
        System.out.println("Original Instance Hashcode before Reflection: " + BreakDownSingletonDemo.getInstance().hashCode());
        //Using Reflection Concept to access the private constructor in a class and modify
        Class<?> singletonClass = Class.forName("DesignPatterns.CreationalDesignPatterns.SingletonPattern.BreakSingleton.BreakDownSingletonDemo");
        Constructor<BreakDownSingletonDemo> singletonClassConstructor =
                (Constructor<BreakDownSingletonDemo>) singletonClass.getDeclaredConstructor();
        singletonClassConstructor.setAccessible(true);
        BreakDownSingletonDemo duplicateInstanceUsingReflection = singletonClassConstructor.newInstance();
        System.out.println("Duplicate Instance Hashcode after Reflection: " +duplicateInstanceUsingReflection.hashCode()+"\n");
    }

    private static void usingSerialization() {
        System.out.println("--------------------USING SERIALIZATON--------------------");
        File streamFile = new File("C:\\Users\\a819557\\Serialization.txt");
        try {
            // Serialization Process
            BreakDownSingletonDemo singletonClassForSerialization = BreakDownSingletonDemo.getInstance();
            System.out.println("Original Instance Hashcode before Serialization: " + singletonClassForSerialization.hashCode());

            // Serialization
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(streamFile))) {
                objectOutputStream.writeObject(singletonClassForSerialization);
            }

            // DeSerialization Process
            BreakDownSingletonDemo duplicateInstanceUsingSerialization;
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(streamFile))) {
                duplicateInstanceUsingSerialization = (BreakDownSingletonDemo) objectInputStream.readObject();
            }

            System.out.println("Duplicate Instance Hashcode after Serialization: " + duplicateInstanceUsingSerialization.hashCode());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Delete the file
            if (streamFile.exists() && streamFile.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file or file does not exist.");
            }
        }
    }

    private static void usingCloning() throws CloneNotSupportedException {
        System.out.println("\n-----------------------USING CLONING----------------------");
        BreakDownSingletonDemo singletonClassForCloning = BreakDownSingletonDemo.getInstance();
        System.out.println("Original Instance Hashcode before Cloning: " + singletonClassForCloning.hashCode());
        //Using Cloning concept to break down the instance
        BreakDownSingletonDemo duplicateInstanceUsingCloning = (BreakDownSingletonDemo) singletonClassForCloning.clone();
        System.out.println("Duplicate Instance Hashcode after Cloning: " + duplicateInstanceUsingCloning.hashCode());
    }
}
