package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VitaminsTest {

    @Test
    public void constructorTest() {

        String expectedName = "Basic Nutrients 2/Day MultiVitamin";
        String expectedBrand = "Thorne";
        int expectedQty = 30;
        float expectedPrice = 30.00f;

        Vitamins testVitamins = new Vitamins(expectedName, expectedBrand, expectedQty, expectedPrice);

        Assertions.assertEquals(expectedName, testVitamins.getName());
        Assertions.assertEquals(expectedBrand, testVitamins.getBrand());
        Assertions.assertEquals(expectedQty, testVitamins.getPrice());
        Assertions.assertEquals(expectedPrice, testVitamins.getPrice());
    }

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
        float expected = 28.00f;
        Vitamins testVitamins = new Vitamins();
        testVitamins.setPrice(expected);
        Assertions.assertEquals(expected, testVitamins.getPrice());
    }

}