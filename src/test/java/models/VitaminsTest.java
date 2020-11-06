package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VitaminsTest {

    @Test
    public void setNameTest() {
        String expected = "Basic Nutrients 2/Day MultiVitamin";
        Vitamins testVitamins = new Vitamins();
        testVitamins.setName(expected);
        Assertions.assertEquals(expected, testVitamins.getName());
    }

    @Test
    public void setBrandTest() {
        String expected = "Thorne";
        Vitamins testVitamins = new Vitamins();
        testVitamins.setBrand(expected);
        Assertions.assertEquals(expected, testVitamins.getBrand());
    }

    @Test
    public void setQtyTest() {
        int expected = 30;
        Vitamins testVitamins = new Vitamins();
        testVitamins.setQty(expected);
        Assertions.assertEquals(expected, testVitamins.getQty());
    }

    @Test
    public void setPriceTest() {
        float expected = (float) 28.00;
        Vitamins testVitamins = new Vitamins();
        testVitamins.setPrice(expected);
        Assertions.assertEquals(expected, testVitamins.getPrice());
    }

}