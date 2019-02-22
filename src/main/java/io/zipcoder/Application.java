package io.zipcoder;
import console.IOConsole;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Comparator;
import java.util.Collections;


public class Application {

    List<String> namelist = new ArrayList<String>();
    List<String> typelist = new ArrayList<String>();








    public static void main(String[] args) {
        String [] namesort = new String[]{};
        List<String> namelist = new ArrayList<String>();
        List<String> typelist = new ArrayList<String>();

        IOConsole io = new IOConsole();
        Fish fish = new Fish();
        Dog dog = new Dog();
        Cat cat = new Cat();
        String anspeak = "";
        String anname = "";

        int input = io.getIntegerInput("How Many Pets you have", args);

        //int userinput = io.getIntegerInput(input);

        Map<String, String> animalmap = new HashMap<String, String>();
        Array [] namearray = new Array[]{};
        String kind = "";
        String petname = "";


        for (int i = 0; i < input; i++) {

            kind = io.getStringInput("What Kind of Pet it is", args);

            petname = io.getStringInput("What is name ", args);


            namelist.add(petname);
            typelist.add(kind);
        }


        for (int i = 0; i < namelist.size(); i++) {

            if (typelist.get(i).equalsIgnoreCase("Cat")) {
                cat.setName(namelist.get(i));
                anspeak = cat.speak();
                anname = cat.getName();
                animalmap.put(anname, anspeak);
            }


            if (typelist.get(i).equalsIgnoreCase("Dog")) {
                dog.setName(namelist.get(i));
                anspeak = dog.speak();
                anname = dog.getName();

                animalmap.put(anname, anspeak);


            }
            if (typelist.get(i).equalsIgnoreCase("Fish")) {
                fish.setName(namelist.get(i));
                anspeak = fish.speak();
                anname = fish.getName();

                animalmap.put(anname, anspeak);


            }


        }

        Iterator it = animalmap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            io.println(pair.getKey() + " = " + pair.getValue());


            io.println("Animal Name is " + pair.getKey() + " and it speaks like " + pair.getValue());
            Collections.sort (namelist);
           io.println(namelist.toString());


        }





    }



}
