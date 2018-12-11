package MobileShop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ItemTest {
    @Test
    public void twoItemsWIthTheSamePriceAndNameShouldBeEqual() {
        assertEquals(new Item("item", 123.12), new Item("item", 123.12));
    }
    @Test
    public void twoItemsWIthTheSamePriceAndOtherNameShouldBeEqual() {
        assertNotEquals(new Item("item1", 123.12), new Item("item2", 123.12));
    }
    @Test
    public void twoItemsWIthOtherPriceShouldNotBeEqual() {
        assertNotEquals(new Item("item", 123.22), new Item("item", 123.12));
    }
    @Test
    public void twoItemsWIthOtherPriceAndNameShouldNotBeEqual() {
        assertNotEquals(new Item("item1", 123.22), new Item("item", 123.12));
    }
    @Test
    public void itemsWithTheSameNameShouldHaveTheSameHashCode() {
        assertEquals(new Item("item", 123).hashCode(), new Item("item", 321).hashCode());
    }
    @Test
    public void itemsWithDifferentNameShouldHaveDifferentHashCode() {
        assertNotEquals(new Item("item1", 123).hashCode(), new Item("item2", 321).hashCode());
    }
}