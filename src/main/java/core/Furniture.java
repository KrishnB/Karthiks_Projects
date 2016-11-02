package core;


import resourses.furnitureType;

import java.util.HashMap;

public class Furniture extends Category {

    furnitureType type;
    int quantity;

    HashMap<furnitureType,Double> furn = new HashMap<furnitureType, Double>();

    public Furniture(furnitureType type,int quantity)throws Exception{
        this.type = type;
        if(quantity > 0)
            this.quantity = quantity;
        else
            throw new Exception("not valid");
        setMap();
    }

    public void setMap(){
        furn.put(furnitureType.DiningTable, 1000.0);
        furn.put(furnitureType.Sofa, 500.0);
        furn.put(furnitureType.TVUnit , 800.0);
    }



}
