package io.zipcoder;
import java.lang.Comparable;
import java.util.Comparator;

public class Fish extends Pet implements Comparable<String> {

    private String  name ;
    private int age;


    @Override

    public String speak(){



        return "Glup" ;
    }

    public int compareTo(String o) {
        return 0;
    }
}
