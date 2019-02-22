package io.zipcoder;

import io.zipcoder.Pet;
import java.util.*;
import java.util.List;
import java.util.Collections;


import java.util.Arrays;
import java.util.Comparator;


/**
 * @author leon on 30/01/2019.
 */
public class PetSorter<Pet> {

    List<Pet> pet = new ArrayList<Pet>();
    public PetSorter(List<Pet> pet) {
        this.pet = pet;
    }






        public List<Pet> sort(Comparator<Pet> comparator) {

        Collections.sort(this.pet, comparator);

        return pet;


    }



    }




