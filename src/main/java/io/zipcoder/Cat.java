package io.zipcoder;
import java.lang.Comparable;

public class Cat extends Pet implements Comparable<String> {




    @Override

    public String speak(){



        return "Meow" ;
    }

    public int compareTo(String o) {
        return 0;
    }
}
