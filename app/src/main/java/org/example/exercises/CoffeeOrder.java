package org.example.exercises;

import javax.annotation.Nonnull;

public class CoffeeOrder {
    private CoffeeSize size;

    public CoffeeOrder(@Nonnull final CoffeeSize size) {
        this.size = size;
    }

    public float getPrice() {
        return switch (size) {
            case SMALL -> 2.50f;
            case MEDIUM -> 3.00f;
            case LARGE -> 3.50f;
        };
    }
}
