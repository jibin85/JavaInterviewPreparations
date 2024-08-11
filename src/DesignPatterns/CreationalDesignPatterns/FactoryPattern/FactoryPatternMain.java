package DesignPatterns.CreationalDesignPatterns.FactoryPattern;

public class FactoryPatternMain {
    public static void main(String[] args) {
        System.out.println("--------------------FACTORY PATTERN--------------------");
        //Example for Factory pattern aka VIRTUAL CONSTRUCTOR
        try {
            //Creating an Object for the Factory class to handle the dynamic Class
            ProfessionAbstractFactory professionFactory = new ProfessionAbstractFactory();

            //This Interface Serves as a Virtual Constructor to call appropriate Class based on Factory Class
            Profession profession;
            String desiredProfession;

            //Calls Doctor Class
            desiredProfession = "Doctor";
            profession = professionFactory.getProfession(desiredProfession);
            profession.printProfession();

            //Calls Engineer Class
            desiredProfession = "Engineer";
            profession = professionFactory.getProfession(desiredProfession);
            profession.printProfession();

            //Calls Scientist Class
            desiredProfession = "Scientist";
            profession = professionFactory.getProfession(desiredProfession);
            profession.printProfession();

            //Negative Scenario where Teacher class is not created
            desiredProfession = "Teacher";
            profession = professionFactory.getProfession(desiredProfession);
            profession.printProfession();
        } catch (NullPointerException nullPointerException) {
            System.out.println("Null Pointer Exception Caught...");
            System.out.println("Profession is yet to be added");
        }
    }
}
