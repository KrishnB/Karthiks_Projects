package core;


public class InteriorDesign {

    double totalPrice;

    public void billAmount(Category category)
    {
        totalPrice = totalPrice + category.calculatePrice();
    }
    public void totalAmount(){
        System.out.println("The total bill amount is:" + totalPrice);
    }


}
