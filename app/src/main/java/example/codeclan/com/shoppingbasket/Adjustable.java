package example.codeclan.com.shoppingbasket;

/**
 * Created by user on 05/02/2017.
 */
interface Adjustable {
    double checkForDeals(Baggable basket);

    void setTenPercentOff(boolean tenPercentOff);
}
