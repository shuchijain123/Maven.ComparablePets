package io.zipcoder;

import java.util.Comparator;

public class Pet implements Comparator<Pet> {


    private String name;
    private String type;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


    public Pet(String type, String name) {
        this.type = type;
        this.name = name;

    }


    public Pet() {

        this.name = "Milli";
        this.type = "Cat";
    }

    public String speak() {


        return "null";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int compare(Pet o1, Pet o2) {
        int comp = o1.getType().compareTo(o2.getType());


        return comp;

    }

}
