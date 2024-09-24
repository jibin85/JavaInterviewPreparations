package DesignPatterns.CreationalDesignPatterns.BuilderPattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Director {
    private final Builder builder;
    
//    public Director(Builder builderType){
//        this.builder = builderType;
//    }
    
    public Home getComplexHomeObject(){
        return this.builder.getComplexObject();
    }
    
    public void manageRequiredHomeType(){
        this.builder.buildFloor();
        this.builder.buildWalls();
        this.builder.buildTerrace();
    }
}
