package DesignPatterns.CreationalDesignPatterns.BuilderPattern;

public class BuilderPatternMain {
    public static void main(String[] args) {
        System.out.println("------------------------------BUILDER PATTERN------------------------------\n");
        earthQuakeResistantType();
        floodResistantType();
    }

    //Used without Lombok Concept to retrieve details using this Keyword
    private static void earthQuakeResistantType() {
        //Call Director Class as a point of contact
        //Call constructor type of required builder
        EarthQuakeResistantType earthQuakeResistantType = new EarthQuakeResistantType();
        Director director = new Director(earthQuakeResistantType);
        director.manageRequiredHomeType();
        //Retrieve the Home Type
        Home homeType  = director.getComplexHomeObject();
        System.out.println("Current Construction Type: "+earthQuakeResistantType.getClass().getSimpleName());
        System.out.println("Building Wall Type       : "+homeType.wall);
        System.out.println("Building Wall Floor      : "+homeType.floor);
        System.out.println("Building Wall Terrace    : "+homeType.terrace+"\n");
    }

    //Used Lombok concept for POJO class HOME using @Data annotation and Getters and Setters
    private static void floodResistantType() {
        //Call Director Class as a point of contact
        //Call constructor type of required builder
        FloodResistantType floodResistantType = new FloodResistantType();
        Director director = new Director(floodResistantType);
        director.manageRequiredHomeType();
        //Retrieve the Home Type
        Home homeType  = director.getComplexHomeObject();
        System.out.println("Current Construction Type: "+floodResistantType.getClass().getSimpleName());
        System.out.println("Building Wall Type       : "+homeType.getWall());
        System.out.println("Building Wall Floor      : "+homeType.getFloor());
        System.out.println("Building Wall Terrace    : "+homeType.getTerrace()+"\n");
    }
}
