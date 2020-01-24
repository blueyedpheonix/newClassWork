package PracticeCompare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
        new Person("Dylan", 23),
        new Person("Omer", 32),
        new Person("Jake", 28),
        new Person("Yonatan", 58)
        );
        System.out.println(personList);
        Collections.sort(personList);
        System.out.println(personList);

    }
}
