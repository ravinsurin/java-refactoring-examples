package org.example.after;

import lombok.Getter;
import lombok.Setter;

public enum CoffeeSize {
    SMALL("small", 2.50f),
    MEDIUM("medium", 3.00f),
    LARGE("large", 3.50f);

    @Getter
    private final String name;

    @Getter
    private final float price;

    CoffeeSize(String name, float price){
        this.name = name;
        this.price = price;
    }

}

