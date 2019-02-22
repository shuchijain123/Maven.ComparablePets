package io.zipcoder;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.Comparator;

public class Dog extends Pet implements Comparable<String> {
    String [] namesort = new String[]{};





        @Override

    public String speak(){



        return "Bark" ;
    }




    public int compareTo(String name)

    {


        return 0;

    }


    /*public String [] sort(Comparator<String> comparator) {

        Arrays.sort (namesort, comparator);

        return namesort;


    }*/



}
