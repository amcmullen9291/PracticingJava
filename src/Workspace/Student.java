package Workspace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Student {
     static String name = "";
     static int currentGrade = 9;
     static double gpa = 0.0;

    public static void main(String[] args) {
        filterReduceMap();
    }
    public Student (String name, int currentGrade, double gpa ){
        this.name = name;
        this.currentGrade = currentGrade;
        this.gpa= gpa;
    }

    public static void filterReduceMap(){
        Student ken = new Student("Kenny Smith", 12, 3.5);
        Student arron = new Student("Stephen Rodgers", 12, 3.7);
        Student william = new Student("William Kipling", 12, 3.9);
        Student shawn = new Student("Shawn Madison", 12, 2.1);
        Student james = new Student("James Chambers", 11, 3.2);


        IntStream
                .range(1,10)
                .forEach(System.out::print); // notice the double colons
        System.out.println();

        IntStream
                .range(1,10)
                .skip(5)  // skip first x number of indexes
                .forEach(x -> System.out.print(x)); // the 'x' is a lambda or variable
        System.out.println(); //placeholder fed into forEach

        System.out.println(IntStream
                .range(1,10)
                .sum()); // order changed. sum doesn't print
        System.out.println();

        Stream.of("ken" ,"arron", "william", "shawn", "james")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println("----------------------");

        //filter function

        String[] names = {"Ken", "James", "Paul", "Mark", "Justin", "Kimberly"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("K")|| x.startsWith("P")) // variable for the filter
                .sorted()
                .forEach(System.out::println);

        //map function

        Arrays.stream(new int[] {1,2,3,4,5,6,7,8,9})
                .map(x -> x*2)
                .average() // because it has to return a single value?
                .ifPresent(System.out::println);

        System.out.println(Arrays.stream(new int[] {1,2,3,4,5,6,7,8,9})
                .map(x -> x*2).count()); // same as above in one line

        System.out.println("-----------");
        String[] names2 = {"Ken", "James", "Paul", "Mark", "Justin", "Kimberly"};
        Stream.of(names2) // same as Arrays.stream
                .map(String::toUpperCase)
                .sorted()
                .filter(x -> x.startsWith("J"))
                .forEach(System.out::println);

    }
}
