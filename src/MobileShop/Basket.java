package MobileShop;

import java.util.Map;
import java.util.TreeMap;

public class Basket {

    private final Map<Item, Integer> order = new TreeMap<>();

    public void addItem(Item item){
        addItems(item,1);
    }

    private void addItems(Item item, int quantity) {
        if (quantity<=0){
            throw new IllegalArgumentException(String.format("Quantity %d must be positive", quantity));
        }
        if (order.containsKey(item)){
            quantity = order.get(item) + quantity;
        }
        order.put(item, quantity);
    }

    public void removeItem(Item item){
        removeItems(item,1);
    }

    private void removeItems(Item item, int quantity) {
    }

    public double getOrderValue(){
        double orderValue = 0;
        return orderValue;
    }
    public void quantity(){

    }
}
