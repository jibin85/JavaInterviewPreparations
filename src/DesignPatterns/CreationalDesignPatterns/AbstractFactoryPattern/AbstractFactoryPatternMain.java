package DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern;

public class AbstractFactoryPatternMain {
    public static void main(String[] args) {
        System.out.println("--------------------ABSTRACT FACTORY PATTERN--------------------");
        System.out.println("");
        System.out.println("----------TRAINEES----------");

        Profession profession;
        String desiredProfession;
        //Example for Abstract Factory pattern aka KIT and FACTORY OF FACTORY
        try {
            //Initial point to determine to get into Trainee factory
            AbstractFactory abstractFactory1 = AbstractFactoryProducer.getProfession(true);

            //Produces TraineeEngineer class based on Abstract Factory value
            desiredProfession = "Engineer";
            profession = abstractFactory1.getProfession(desiredProfession);
            profession.printProfession();

            //Produces TraineeDoctor class based on Abstract Factory value
            desiredProfession = "Doctor";
            profession = abstractFactory1.getProfession(desiredProfession);
            profession.printProfession();

            //Produces TraineeScientist class based on Abstract Factory value
            desiredProfession = "Scientist";
            profession = abstractFactory1.getProfession(desiredProfession);
            profession.printProfession();

            //Negative Scenario where TraineeTeacher class is not created
            desiredProfession = "Teacher";
            profession = abstractFactory1.getProfession(desiredProfession);
            profession.printProfession();
        } catch (NullPointerException nullPointerException) {
            System.out.println("Null Pointer Exception Caught...");
            System.out.println("Trainee profession is yet to be added");
        }
        
        System.out.println("");
        System.out.println("----------PROFESSIONALS----------");
        try{
            //Initial point to determine to get into Professional Factory
            AbstractFactory abstractFactory2 = AbstractFactoryProducer.getProfession(false);

            //Produces Engineer class based on Abstract Factory value
            desiredProfession = "Engineer";
            profession = abstractFactory2.getProfession(desiredProfession);
            profession.printProfession();

            //Produces Doctor class based on Abstract Factory value
            desiredProfession = "Doctor";
            profession = abstractFactory2.getProfession(desiredProfession);
            profession.printProfession();

            //Produces Scientist class based on Abstract Factory value
            desiredProfession = "Scientist";
            profession = abstractFactory2.getProfession(desiredProfession);
            profession.printProfession();

            //Negative Scenario where Teacher class is not created
            desiredProfession = "Teacher";
            profession = abstractFactory2.getProfession(desiredProfession);
            profession.printProfession();
        }catch (NullPointerException nullPointerException){
            System.out.println("Null Pointer Exception Caught...");
            System.out.println("Profession is yet to be added");
        }
    }
}
