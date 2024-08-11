package DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern;

import com.sun.org.apache.xpath.internal.operations.Bool;

public abstract class AbstractFactory {
    abstract Profession getProfession(String desiredProfession);
}
