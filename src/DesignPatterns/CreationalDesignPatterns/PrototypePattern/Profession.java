package DesignPatterns.CreationalDesignPatterns.PrototypePattern;

public abstract class Profession implements Cloneable {
    public int id;
    
    abstract void getProfession();
    
    public Object clonedInstance(){
        Object clonedObject = null;
        try{
            clonedObject = super.clone();
        }catch (CloneNotSupportedException exception){
            exception.printStackTrace();
        }
        return clonedObject;
    }
    
}
