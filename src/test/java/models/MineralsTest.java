package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MineralsTest {

    @Test
    public void setNameTest() {
        String expected = "Magnesium";
        Minerals testVitamins = new Minerals();
        testVitamins.setName(expected);
        Assertions.assertEquals(expected, testVitamins.getName());
    }

    @Test
    public void setBrandTest() {
        String expected = "Pure";
        Minerals testVitamins = new Minerals();
        testVitamins.setBrand(expected);
        Assertions.assertEquals(expected, testVitamins.getBrand());
    }

    @Test
    public void setQtyTest() {
        int expected = 60;
        Minerals testVitamins = new Minerals();
        testVitamins.setQty(expected);
        Assertions.assertEquals(expected, testVitamins.getQty());
    }

    @Test
    public void setPriceTest() {
        float expected = (float) 15.00;
        Minerals testVitamins = new Minerals();
        testVitamins.setPrice(expected);
        Assertions.assertEquals(expected, testVitamins.getPrice());
    }

}