package DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern;

public class Doctor implements Profession {
    @Override
    public void printProfession() {
        System.out.println("I am a Doctor!");
    }
}

