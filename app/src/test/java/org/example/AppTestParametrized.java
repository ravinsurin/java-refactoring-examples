package org.example;

import org.example.after.CoffeeOrder;
import org.example.after.CoffeeSize;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class AppTestParametrized {



    @ParameterizedTest
    @EnumSource(CoffeeSize.class)
    void testValueForCoffeeSize(CoffeeSize size){
        double value = size.getPrice();
        assertTrue(value >=2.5 && value <=3.5);
    }

    @ParameterizedTest
    @EnumSource(CoffeeSize.class)
    void testCountOfCoffeeSize(CoffeeSize size){
        //can we get count of enum values?
    }

//    @ParameterizedTest
//    @CsvSource({"1,2.5"})

    @ParameterizedTest
    @MethodSource("provideArguments")
    void multiple_orders(CoffeeSize size, int quantity, double expectedCost){
        CoffeeOrder order = new CoffeeOrder();
        order.addToOrder(size, quantity);
        double cost = order.getTotalPrice();
        assertEquals(expectedCost, cost, 0.01);
    }

    private static Stream<Arguments> provideArguments(){
        return Stream.of(
                Arguments.of(CoffeeSize.LARGE,1,3.5),
                Arguments.of(CoffeeSize.MEDIUM,1,3.0),
                Arguments.of(CoffeeSize.SMALL,1,2.5),
                Arguments.of(CoffeeSize.MEDIUM,3,9.0),
                Arguments.of(CoffeeSize.SMALL,10,25),
                Arguments.of(CoffeeSize.LARGE,4,14.0)
        );
    }

}
