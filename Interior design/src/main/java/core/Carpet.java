package core;


import resourses.carpetType;
import java.util.HashMap;

public class Carpet extends Category{

    carpetType type;
    int quantity;
    HashMap<carpetType,Double> carp = new HashMap<carpetType, Double>();
    public Carpet(carpetType type,int quantity){
        this.type = type;
        this.quantity = quantity;

        setMap();
    }

    public void setMap(){

        carp.put(carpetType.RectangleCarpet, 1.4);
        carp.put(carpetType.SquareCarpet, 1.0);
    }

    public double calculatePrice()
    {
        double val = carp.get(type);
        double price;
        if(val == 1.0){
             price = (quantity * val * 75);
        }
        else {
             price = (quantity * val * 100);
        }

        return  price;

    }
}
