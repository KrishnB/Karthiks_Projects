package core;


import resourses.ElectronicType;

import java.util.HashMap;

public class Electronics extends Category {

    ElectronicType type;
    int quantity;
    HashMap<ElectronicType,Double> elec = new HashMap<ElectronicType, Double>();
    public Electronics(ElectronicType type, int quantity){
        this.type = type;
        this.quantity = quantity;

        setMap();
    }

    public void setMap(){
        elec.put(ElectronicType.Television, 100.0);
        elec.put(ElectronicType.Printer, 50.0);
        elec.put(ElectronicType.AirConditioner, 80.0);
    }

}
