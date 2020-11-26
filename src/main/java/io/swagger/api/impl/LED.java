package io.swagger.api.impl;

public class LED{
    private String color;

    private static LED instance;
    
    private LED(){
        color="Verde";
    }
    
    public static LED getInstance(){
        if(instance == null){
            instance = new LED();
        }
        return instance;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }
}