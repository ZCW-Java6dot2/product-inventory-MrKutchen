package services;

import models.Vitamins;

import java.util.ArrayList;

public class VitaminsServices {

    private static int nextId = 1;
    private ArrayList<Vitamins> inventory = new ArrayList<>();


    public Vitamins create(String name, String brand, int qty, float price) {

        Vitamins createdVitamin = new Vitamins(nextId++, name, brand, qty, price);

        inventory.add(createdVitamin);

        return createdVitamin;
    }

    public Vitamins findVitamins(int nextId) {
        Vitamins result = null;
        for (int i = 0; i < inventory.size(); i++) {
            if (nextId == i) {
                result = inventory.get(i);
            } else {
                System.out.println("Item is not in inventory.");
            }
        }
        return result;
    }

    public Vitamins[] findAll() {
            Vitamins[] vitamins = new Vitamins[inventory.size()];
            for (int i = 0; i < inventory.size(); i++) {
                vitamins[i] = inventory.get(i);
            }
            return vitamins;
        }

    public boolean delete(int nextId) {
        boolean isItemPresent = false;
        for (int i = 0; i < inventory.size(); i++) {
            isItemPresent = nextId == i;
        }
        return isItemPresent;
    }
}

