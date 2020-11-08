package services;

import models.Minerals;
import models.Vitamins;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MineralServicesTest {

    @Test
    public void createTest() {
        String expectedName = "Magnesium";
        String expectedBrand = "Pure";
        int expectedQty = 60;
        float expectedPrice = 15.00f;

        MineralServices mineralServices = new MineralServices();
        Minerals testMinerals = mineralServices.create(expectedName, expectedBrand, expectedQty, expectedPrice);

        int actualId = testMinerals.getId();
        String actualName = testMinerals.getName();
        String actualBrand = testMinerals.getBrand();
        int actualQty = testMinerals.getQty();
        float actualPrice = testMinerals.getPrice();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(actualPrice, actualPrice);
    }

}