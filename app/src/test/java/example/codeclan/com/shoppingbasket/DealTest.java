package example.codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/02/2017.
 */

public class DealTest {

    private Buyable item;
    private Baggable basket;
    private Adjustable deal;

    @Before
    public void before(){
        basket = new Basket();
        deal = new Deal();
        item = new Item("Steak", 10);
    }

    @Test
    public void canGive10PercentDiscount(){
        deal.setTenPercentOff(true);

        basket.addItem(item);
        basket.addItem(item);
        basket.addItem(item);

        basket.checkDeal(deal);


        assertEquals(27, basket.getTotal());

    }
}
