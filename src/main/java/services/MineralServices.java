package services;

import models.Minerals;

import java.util.ArrayList;

public class MineralServices {

    private static int nextId = 1;
    private ArrayList<Minerals> inventory = new ArrayList<>();


    public Minerals create(String name, String brand, int qty, float price) {

        Minerals createdMineral = new Minerals(nextId++, name, brand, qty, price);

        inventory.add(createdMineral);

        return createdMineral;
    }

    public Minerals findMinerals(int nextId) {
        Minerals result = null;
        for (int i = 0; i < inventory.size(); i++) {
            if (nextId == i) {
                result = inventory.get(i);
            } else {
                System.out.println("Item is not in inventory.");
            }
        }
        return result;
    }

    public Minerals[] findAll() {
        Minerals[] mineral = new Minerals[inventory.size()];
        for (int i = 0; i < inventory.size(); i++) {
            mineral[i] = inventory.get(i);
        }
        return mineral;
    }

    public boolean delete(int nextId) {
        boolean isItemPresent = false;
        for (int i = 0; i < inventory.size(); i++) {
            isItemPresent = nextId == i;
        }
        return isItemPresent;
    }
}
