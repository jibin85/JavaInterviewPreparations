package DesignPatterns.CreationalDesignPatterns.PrototypePattern;

public class PrototypePatternMain {
    public static void main(String[] args) {
        try {
            System.out.println("--------------------PROTOTYPE PATTERN--------------------");
            //Initializing the Pre-defined Objects which is present in this Cache class
            ProfessionCache.loadProfessionCache();
            
            //Calling Doctor object using the id 1 which is pre-defined in this method
            Profession doctor1 = ProfessionCache.getCacheInstance(1);
            doctor1.getProfession();
            System.out.println("Hashcode for Doctor1: " + doctor1.hashCode());

            //Calling Same Doctor with new variable, gives different doctor object
            Profession doctor2 = ProfessionCache.getCacheInstance(1);
            doctor2.getProfession();
            System.out.println("Hashcode for Doctor2: " + doctor2.hashCode());
            
            //Calling Engineer Object using id 2
            Profession engineer = ProfessionCache.getCacheInstance(2);
            engineer.getProfession();
            System.out.println("Hashcode for Engineer: " + engineer.hashCode());

            //Calling Scientist Object using id 3
            Profession scientist = ProfessionCache.getCacheInstance(3);
            scientist.getProfession();
            System.out.println("Hashcode for Scientist: " + scientist.hashCode());

            //Negative Scenario trying to call an object with an invalid ID
            Profession teacher = ProfessionCache.getCacheInstance(4);
            teacher.getProfession();
            System.out.println("Hashcode for Teacher: " + teacher.hashCode());
        }catch (NullPointerException exception){
            System.out.println("Invalid Profession id!");
        }
    }
}
