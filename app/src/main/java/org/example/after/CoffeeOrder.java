package org.example.after;

import javax.annotation.Nonnull;
import java.util.*;

public class CoffeeOrder {

    private Map<CoffeeSize, Integer> orders = new HashMap<>();

    public void addToOrder(CoffeeSize coffeeSize, int quantity){
        orders.merge(coffeeSize, quantity, Integer::sum);
    }

    public double getTotalPrice(){
        return orders.entrySet().stream()
                .mapToDouble(e -> e.getKey().getPrice() * e.getValue())
                .sum();
    }

}

