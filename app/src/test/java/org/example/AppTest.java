/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.example.after.CoffeeOrder;
import org.example.after.CoffeeSize;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void testLargeGetTotalPrice(){
        CoffeeOrder coffeeOrder = new CoffeeOrder();
        coffeeOrder.addToOrder(CoffeeSize.LARGE, 2);

        assertEquals(7.00f,coffeeOrder.getTotalPrice(),0.01);
    }

    @Test
    void testMediumGetTotalPrice(){
        CoffeeOrder coffeeOrder = new CoffeeOrder();
        coffeeOrder.addToOrder(CoffeeSize.MEDIUM, 3);

        assertEquals(9.00f,coffeeOrder.getTotalPrice(),0.01);
    }

    @Test
    void testSmallGetTotalPrice(){
        CoffeeOrder coffeeOrder = new CoffeeOrder();
        coffeeOrder.addToOrder(CoffeeSize.SMALL, 4);

        assertEquals(10.00f,coffeeOrder.getTotalPrice(),0.01);
    }

    @Test
    void testMixedGetTotalPrice(){
        CoffeeOrder coffeeOrder = new CoffeeOrder();
        coffeeOrder.addToOrder(CoffeeSize.SMALL, 2);
        coffeeOrder.addToOrder(CoffeeSize.MEDIUM, 3);
        coffeeOrder.addToOrder(CoffeeSize.LARGE, 4);

        assertEquals(28.00f,coffeeOrder.getTotalPrice(),0.01);
    }

    @Test
    void testMixedGetTotalPrice2(){
        CoffeeOrder coffeeOrder = new CoffeeOrder();
        coffeeOrder.addToOrder(CoffeeSize.SMALL, 0);
        coffeeOrder.addToOrder(CoffeeSize.MEDIUM, 0);
        coffeeOrder.addToOrder(CoffeeSize.LARGE, 0);

        assertEquals(0.00f,coffeeOrder.getTotalPrice(),0.01);
    }
}
