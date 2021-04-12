package edu.qc.seclass.glm;

import java.util.ArrayList;
import java.util.List;

public class Item {
    String itemName;
    double itemValue;
    String itemDescription;


    public Item(String itemName, double itemValue, String itemDescription) {
        this.itemName = itemName;
        this.itemValue = itemValue;
        this.itemDescription = itemDescription;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemValue() {
        return itemValue;
    }

    public void setItemValue(double itemValue) {
        this.itemValue = itemValue;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}
