package io.zipcoder;
import io.zipcoder.Pet;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ApplicationTest {


    @Test
    public void sortbytype() {
        // given
        Pet pet1 = new Pet("Fish", "Glup");
        Pet pet2 = new Pet("Cat", "Milo");
        Pet pet3 = new Pet("Dog", "Bruno");

        List<Pet> petsort = new ArrayList<Pet>();
        petsort.add(pet1);
        petsort.add(pet2);
        petsort.add(pet3);
        List<Pet> petsortex = new ArrayList<Pet>();
        petsortex.add(pet2);
        petsortex.add(pet3);
        petsortex.add(pet1);

        PetSorter petsorter = new PetSorter(petsort);

        Comparator<Pet> comp = (Comparator<Pet>) new Pet();

        // when
        List<Pet> actual = petsorter.sort(comp);


        // then
        Assert.assertEquals(petsortex, petsort);
    }






    @Test
    public void testNullaryConstructor() {
        // given
        String expectedName = "Milli";
        String expectedtype = "Cat";


        // when
        Pet pet = new Pet();
        pet.setName("Milli");
        pet.setType("Cat");

        String actualName = pet.getName();
        String actualtype = pet.getType();

        // then

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedtype, actualtype);
    }

    @Test
    public void testNonNullaryConstructor() {
        // given
        String expectedName = "Milli";
        String expectedtype = "Cat";


        // when
        Pet pet = new Pet( expectedtype, expectedName);


        String actualName = pet.getName();
        String actualtype = pet.getType();

        // then

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedtype, actualtype);
    }


        @Test
        public void getNametest() {
            // given
            String expectedCatname = "Milli";
            String expectedDogname = "Milo";
            Pet pet = new Pet();
            Dog dog = new Dog();
            Cat cat = new Cat();

            // when
            cat.setName("Milli");
            dog.setName("Milo");
            String actualcatname = cat.getName();
            String actualdogname = dog.getName();

            // then
            Assert.assertEquals(expectedCatname, actualcatname);
            Assert.assertEquals(expectedDogname, actualdogname);


        }

    @Test
    public void polytest1() {
        Dog dog = new Dog();
        Assert.assertTrue(dog instanceof Comparable);
    }
    @Test
    public void polytest2() {
        Cat cat = new Cat();
        Assert.assertTrue(cat instanceof Comparable);
    }

    @Test
    public void speakTest() {
        Cat cat = new Cat();
        Dog dog = new Dog();
        String expectedcat = "Meow";
        String expecteddog = "Bark";
        String actual = cat.speak();
        Assert.assertEquals(expectedcat, actual);
        Assert.assertEquals(expectedcat, actual);
    }

    }

