package org.example.jpms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {
    @Test
    public void testToString() {
        System.out.printf("\nTesting module: %s\n\n", XMLPrinter.class.getModule().getName());

        Product p = new Product(33, "spaghetti", 2.15);
        Assertions.assertEquals("spaghetti: 2.15", p.toString());
    }
}
