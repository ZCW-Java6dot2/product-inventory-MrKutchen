package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MineralsTest {

    @Test
    public void constructorTest() {

        int expectedId = 1;
        String expectedName = "Magnesium";
        String expectedBrand = "Pure";
        int expectedQty = 60;
        float expectedPrice = 15.00f;

        Minerals testMinerals = new Minerals(expectedId, expectedName, expectedBrand, expectedQty, expectedPrice);

        Assertions.assertEquals(expectedId, testMinerals.getId());
        Assertions.assertEquals(expectedName, testMinerals.getName());
        Assertions.assertEquals(expectedBrand, testMinerals.getBrand());
        Assertions.assertEquals(expectedQty, testMinerals.getPrice());
        Assertions.assertEquals(expectedPrice, testMinerals.getPrice());
    }

    @Test
    public void setId() {
        int expected = 1;
        Minerals testMinerals = new Minerals();
        testMinerals.setId(expected);
        Assertions.assertEquals(expected, testMinerals.getId());
    }

    @Test
    public void setNameTest() {
        String expected = "Magnesium";
        Minerals testMinerals = new Minerals();
        testMinerals.setName(expected);
        Assertions.assertEquals(expected, testMinerals.getName());
    }

    @Test
    public void setBrandTest() {
        String expected = "Pure";
        Minerals testMinerals = new Minerals();
        testMinerals.setBrand(expected);
        Assertions.assertEquals(expected, testMinerals.getBrand());
    }

    @Test
    public void setQtyTest() {
        int expected = 60;
        Minerals testMinerals = new Minerals();
        testMinerals.setQty(expected);
        Assertions.assertEquals(expected, testMinerals.getQty());
    }

    @Test
    public void setPriceTest() {
        float expected = 15.00f;
        Minerals testMinerals = new Minerals();
        testMinerals.setPrice(expected);
        Assertions.assertEquals(expected, testMinerals.getPrice());
    }

}