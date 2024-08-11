package DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern;

import java.util.Objects;

public class TraineeAbstractFactory extends AbstractFactory{

    @Override
    public Profession getProfession(String desiredProfession) {
        if (Objects.nonNull(desiredProfession)) {
            if ("Doctor".equalsIgnoreCase(desiredProfession)) {
                return new TraineeDoctor();
            }
            if ("Engineer".equalsIgnoreCase(desiredProfession)) {
                return new TraineeEngineer();
            }
            if ("Scientist".equalsIgnoreCase(desiredProfession)) {
                return new TraineeScientist();
            }
        }
        return null;
    }
}
