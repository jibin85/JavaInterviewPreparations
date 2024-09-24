package DesignPatterns.CreationalDesignPatterns.PrototypePattern;

import java.util.Hashtable;

public class ProfessionCache {
    private static Hashtable<Integer, Profession> professionTable = new Hashtable<>();
    
    public static Profession getCacheInstance(int id){
        Profession cachedProfession = professionTable.get(id);
        return (Profession) cachedProfession.clonedInstance();
    }
    
    public static void loadProfessionCache(){
        Doctor doctor = new Doctor();
        doctor.id = 1;
        professionTable.put(doctor.id, doctor);

        Engineer engineer = new Engineer();
        engineer.id = 2;
        professionTable.put(engineer.id, engineer);

        Scientist scientist = new Scientist();
        scientist.id = 3;
        professionTable.put(scientist.id, scientist);
        
    }
}
