package services;

import models.Vitamins;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VitaminServicesTest {

    @Test
    public void createTest() {
        String expectedName = "Basic Nutrients 2/Day MultiVitamin";
        String expectedBrand = "Thorne";
        int expectedQty = 30;
        float expectedPrice = 30.00f;

        VitaminsServices vitaminsService = new VitaminsServices();
        Vitamins testVitamins = vitaminsService.create(expectedName, expectedBrand, expectedQty, expectedPrice);

        int actualId = testVitamins.getId();
        String actualName = testVitamins.getName();
        String actualBrand = testVitamins.getBrand();
        int actualQty = testVitamins.getQty();
        float actualPrice = testVitamins.getPrice();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(actualPrice, actualPrice);
    }
}