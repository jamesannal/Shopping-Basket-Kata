package example.codeclan.com.shoppingbasket;

/**
 * Created by user on 05/02/2017.
 */
public interface Baggable {
    int itemCount();

    void addItem(Buyable item);

    void removeItem(Buyable item);

    void emptyBasket();

    void calculateSubTotal();

    double getSubTotal();

    void setTotal(double finalTotal);

    double getTotal();

    void checkDeal(Adjustable deal);

}
