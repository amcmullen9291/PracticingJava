package Workspace;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

public class PracticeSessions3 {
static List<Person> rollCall;

    public static void main(String[] args) {
//        filterReduceMap();
        studentRoster();
//        filterByGpa(3.0F);
        filterByGrade(10);
    }

    public static void filterReduceMap() {
        IntStream
                .range(1, 10)
                .forEach(System.out::print); // notice the double colons
        System.out.println();

        IntStream
                .range(1, 10)
                .skip(5)  // skip first x number of indexes
                .forEach(x -> System.out.print(x)); // the 'x' is a lambda or variable
        System.out.println(); //placeholder fed into forEach

        System.out.println(IntStream
                .range(1, 10)
                .sum()); // order changed. sum doesn't print
        System.out.println();

        Stream.of("ken", "arron", "william", "shawn", "james")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println("----------------------");

        //filter function

        String[] names = {"Ken", "James", "Paul", "Mark", "Justin", "Kimberly"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("K") || x.startsWith("P")) // variable for the filter
                .sorted()
                .forEach(System.out::println);

        //map function

        Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})
                .map(x -> x * 2)
                .average()
                .ifPresent(System.out::println);

        System.out.println(Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})
                .map(x -> x * 2).count()); // same as above in one line

        System.out.println("-----------");
        String[] names2 = {"Ken", "James", "Paul", "Mark", "Justin", "Kimberly"};
        Stream.of(names2) // same as Arrays.stream
                .map(String::toUpperCase)
                .sorted()
                .filter(x -> x.startsWith("J"))
                .forEach(System.out::println);
    }

    public static void studentRoster(){
        rollCall = new ArrayList<Person>();

        rollCall.add(new Person(1,"James", "Lincoln",10, 3.0f));
        rollCall.add(new Person(2,"Mark",  "Twain", 10,3.7f));
        rollCall.add(new Person(3,"Bob",  "Ross", 10,3.0f));
        rollCall.add(new Person(4,"Sam",  "Taylor", 10,3.2f));
        rollCall.add(new Person(5,"Sarah",  "Parker", 12,3.5f));
        rollCall.add(new Person(6,"Tommy", "Hill", 11, 2.8f));
    }

    public static void filterByGpa(Float currentGpa){
        rollCall.stream()
                .filter(student -> student.getGpa() > currentGpa)
                .forEach(x -> System.out.println(x.firstName +" "+ x.lastName));
    }
    public static void filterByGrade(int currentGrade){
        rollCall.stream()
                .filter(student -> student.getGrade() == currentGrade)
                .forEach(x -> System.out.println(x.firstName +" "+ x.lastName));
    }


}
