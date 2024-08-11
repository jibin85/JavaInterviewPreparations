package DesignPatterns.CreationalDesignPatterns.FactoryPattern;

import java.util.Objects;

public class ProfessionAbstractFactory {
    public Profession getProfession(String desiredProfession){
            if (Objects.nonNull(desiredProfession)) {
                if ("Doctor".equalsIgnoreCase(desiredProfession)) {
                    return new Doctor();
                }
                if ("Engineer".equalsIgnoreCase(desiredProfession)) {
                    return new Engineer();
                }
                if ("Scientist".equalsIgnoreCase(desiredProfession)) {
                    return new Scientist();
                }
            }
        return null;
    }
}
