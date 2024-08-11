package DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class AbstractFactoryProducer {
    public static AbstractFactory getProfession(Boolean isTrainee){
        if(Boolean.TRUE.equals(isTrainee)){
            return  new TraineeAbstractFactory();
        }else{
            return  new ProfessionAbstractFactory();
        }
    }
}
