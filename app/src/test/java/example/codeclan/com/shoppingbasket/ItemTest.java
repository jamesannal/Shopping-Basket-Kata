package example.codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/02/2017.
 */

public class ItemTest {
    private Buyable item;

    @Before
    public void before(){
        item = new Item("Chicken", 4.99);
    }

    @Test
    public void canGetItemName(){
        assertEquals("Chicken", item.getName());
    }

    @Test
    public void canGetItemPrice(){
        assertEquals(4.99, item.getPrice());
    }
}
