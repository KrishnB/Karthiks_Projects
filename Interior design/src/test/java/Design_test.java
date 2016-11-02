import core.*;
import org.testng.annotations.Test;
import resourses.carpetType;
import resourses.ElectronicType;
import resourses.furnitureType;



public class Design_test {



   @Test
    public Design_test() throws Exception {
        InteriorDesign ind = new InteriorDesign();

        Category cat1 = new Furniture(furnitureType.DiningTable , 2);
        ind.billAmount(cat1);
        Category cat2 = new Electronics(ElectronicType.Printer, 3);
        ind.billAmount(cat2);
        Category cat3 = new Carpet(carpetType.SquareCarpet ,5);
        ind.billAmount(cat3);
        ind.totalAmount();
    }
}
