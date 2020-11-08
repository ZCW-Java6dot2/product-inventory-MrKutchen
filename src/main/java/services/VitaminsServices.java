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


public class VitaminsServices {

    private static int nextId = 1;
    private List<Vitamins> inventory = new ArrayList<>();


    public void readingJSON() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            this.inventory = (ArrayList<Vitamins>) objectMapper.readValue(new File("Mineral.json"), new TypeReference<List<Vitamins>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeJSON() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(new File("Vitamins.json"), inventory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



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

    public List<Vitamins> printAll() {
        return this.inventory;
    }

    public boolean delete(int nextId) {
        boolean isItemPresent = false;
        for (int i = 0; i < inventory.size(); i++) {
            isItemPresent = nextId == i;
        }
        return isItemPresent;
    }

}

