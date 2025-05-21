package org.example;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.example.after.CoffeeOrder;
import org.example.after.CoffeeSize;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTestAssertJ {

    CoffeeOrder coffeeOrder;

    @BeforeEach
    void setup(){
        coffeeOrder = new CoffeeOrder();
    }


    @Test
    void testLargeGetTotalPrice(){
        coffeeOrder.addToOrder(CoffeeSize.LARGE, 2);

        assertThat(coffeeOrder).isNotNull();
        assertThat(coffeeOrder.getTotalPrice()).isEqualTo(7.0, Offset.offset(0.01));
    }

    @Test
    void testSmallGetTotalPrice(){
        coffeeOrder.addToOrder(CoffeeSize.SMALL, 3);

        assertThat(coffeeOrder).isNotNull();
        assertThat(coffeeOrder.getTotalPrice()).isEqualTo(7.5, Offset.offset(0.01));
    }

    @Test
    void testMediumGetTotalPrice(){
        coffeeOrder.addToOrder(CoffeeSize.MEDIUM, 4);

        assertThat(coffeeOrder).isNotNull();
        assertThat(coffeeOrder.getTotalPrice()).isEqualTo(12.0, Offset.offset(0.01));
    }

    @Test
    void testMixedGetTotalPrice(){
        coffeeOrder.addToOrder(CoffeeSize.MEDIUM, 4);
        coffeeOrder.addToOrder(CoffeeSize.LARGE, 1);
        coffeeOrder.addToOrder(CoffeeSize.SMALL, 1);

        assertThat(coffeeOrder).isNotNull();
        assertThat(coffeeOrder.getTotalPrice()).isEqualTo(18.0, Offset.offset(0.01));
    }
}
