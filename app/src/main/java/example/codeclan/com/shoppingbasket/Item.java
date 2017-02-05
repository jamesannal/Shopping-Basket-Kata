package example.codeclan.com.shoppingbasket;

/**
 * Created by user on 05/02/2017.
 */

class Item implements Buyable{
    private String name;
    private double price;

    Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

}
