package example.codeclan.com.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 05/02/2017.
 */

public class Deal implements Adjustable {
    private Baggable basket;
    private ArrayList<Buyable> items;
    private boolean tenPercentOffIfOver20;

    public Deal(){
        items = new ArrayList<Buyable>();
        tenPercentOffIfOver20 = false;
    }

    public void setTenPercentOff(boolean tenPercentOff){
        this.tenPercentOffIfOver20 = tenPercentOff;
    }

    public double checkForDeals(Baggable basket){
        if(tenPercentOffIfOver20){
            basket.setTotal(tenPercentOff(basket));
        }
        return basket.getTotal();
    }

    private double tenPercentOff(Baggable basket){
        double subTotal = basket.getTotal();
        if( subTotal >= 20 ){
            basket.setTotal( subTotal * 0.9 );
        }
        return basket.getTotal();
    }
}
