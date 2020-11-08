package services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import models.Minerals;
import models.Vitamins;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MineralServices {

    private static int nextId = 1;
    private ArrayList<Minerals> inventory = new ArrayList<>();

    public void readingJSON() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            this.inventory = (ArrayList<Minerals>) objectMapper.readValue(new File("Mineral.json"), new TypeReference<List<Minerals>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeJSON() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(new File("Minerals.json"), inventory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


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

    public ArrayList<Minerals> printAll() {
        return this.inventory;
    }

    public boolean delete(int nextId) {
        boolean isItemPresent = false;
        for (int i = 0; i < inventory.size(); i++) {
            isItemPresent = nextId == i;
        }
        return isItemPresent;
    }

    @Override
    public String toString() {
        return "MineralServices{" +
                "inventory=" + inventory +
                '}';
    }
}
