package DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern;

public class Engineer implements Profession {
    @Override
    public void printProfession() {
        System.out.println("I am an Engineer!");
    }
}
