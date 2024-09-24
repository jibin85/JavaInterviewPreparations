package DesignPatterns.CreationalDesignPatterns.BuilderPattern;

public class EarthQuakeResistantType implements Builder{
    
    private Home earthquakeResistorType = new Home();
    
    @Override
    public void buildFloor() {
        this.earthquakeResistorType.floor = "Wooden Floor";
    }

    @Override
    public void buildWalls() {
        this.earthquakeResistorType.wall = "Wooden Walls";
    }

    @Override
    public void buildTerrace() {
        this.earthquakeResistorType.terrace = "WoodenTerrace";
    }

    @Override
    public Home getComplexObject() {
        return this.earthquakeResistorType;
    }
}
