package DesignPatterns.CreationalDesignPatterns.BuilderPattern;

public class FloodResistantType implements Builder {

    private Home floodResistantType = new Home();
    
    @Override
    public void buildFloor() {
        floodResistantType.setFloor("Floor should be 10 Feets above the ground Level");
    }

    @Override
    public void buildWalls() {
        floodResistantType.setWall("Water Resistant Walls should be made");
    }

    @Override
    public void buildTerrace() {
        floodResistantType.setTerrace("Leakage Resistant Terrrace should be made");
    }

    @Override
    public Home getComplexObject() {
        return floodResistantType;
    }
}
