package example.codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/02/2017.
 */

public class BasketTest {

    private Buyable item;
    private Baggable basket;

    @Before
    public void before(){
        basket = new Basket();
        item = new Item("Chicken", 4.99);
    }

    @Test
    public void basketStartsEmpty(){
        assertEquals(0, basket.itemCount());
    }

    @Test
    public void canAddItemToBasket(){
        basket.addItem(item);
        assertEquals(1, basket.itemCount());
    }

    @Test
    public void canRemoveItemFromBasket(){
        basket.addItem(item);
        basket.removeItem(item);
        assertEquals(0, basket.itemCount());
    }

    @Test
    public void canAddTwoItems(){
        basket.addItem(item);
        item = new Item("Beef", 7.99);
        basket.addItem(item);
        assertEquals(2, basket.itemCount());
    }

    @Test
    public void canClearBasket(){
        basket.addItem(item);
        item = new Item("Beef", 7.99);
        basket.addItem(item);
        basket.emptyBasket();
        assertEquals(0, basket.itemCount());
    }

    @Test
    public void canCalculateSubTotal(){
        basket.addItem(item);
        item = new Item("Beef", 7.99);
        basket.addItem(item);
        basket.calculateSubTotal();
        assertEquals(12.98, basket.getSubTotal());
    }

}
