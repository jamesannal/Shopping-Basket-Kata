package example.codeclan.com.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 05/02/2017.
 */

public class Basket implements Baggable {
    private ArrayList<Buyable> items;
    private double total;
    private double subTotal;

    public Basket(){
        items = new ArrayList<Buyable>();
    }

    public int itemCount(){
        return items.size();
    }

    public void addItem(Buyable item){
        items.add(item);
    }

    public void removeItem(Buyable item){
        items.remove(item);
    }

    public void emptyBasket(){
        items.clear();
    }

    public void calculateSubTotal(){
        double total = 0;
        for(int i = 0; i < itemCount(); i++){
            total += items.get(i).getPrice();
        }
        subTotal = total;
    }

    public double getSubTotal(){
        return subTotal;
    }

    public void setTotal(double finalTotal) {
        this.total = finalTotal;
    }

    public double getTotal(){
        return total;
    }

    public void checkDeal(Adjustable deal){
        total = deal.checkForDeals(this);
    }

}
