package Workspace;

import java.util.*;

public class PracticeSessions2  {


    public static void main(String[] args) {
        byte byteVariable = 125; // between-128 and 127
        byte byteVariable2 = (byte)130; // test
        getTypeOfVariable(byteVariable2);
        // if too big  subtracts the overage and then inverses when cast
        getTypeOfVariable(byteVariable); //test
        short shortVariable = 32000; //between -32,768 and 32,767.
        short shortVariableOverage = (short) 42_900; //test
        // if too big subtracts the overage and then inverses when cast
        getTypeOfVariable(shortVariableOverage);
        getTypeOfVariable(shortVariable);
        getTypeOfVariable("Good Morning");
        getTypeOfVariable(12_553);
        getTypeOfVariable(5_236_776_900L);
        getTypeOfVariable(1.F);
        getTypeOfVariable(1.33333333335F);
        getTypeOfVariable(1.0001000500121D);
        getTypeOfVariable("anthony"=="Anthony");
        getTypeOfVariable('b');
        //user can't MAKE/use an array, hashMap, etc. without the programmer knowing it

        countArrayDuplicates();
    }

    public static void getTypeOfVariable(Object input){
        System.out.print(((Object) input).getClass().getSimpleName()); //readable version
        System.out.println(": " + input);
    }

        public static void countArrayDuplicates() {
            ArrayList<Integer> numbers = new ArrayList();
            numbers.add(0,1);
            numbers.add(1,10);
            numbers.add(2,1);
            numbers.add(3,2);
            numbers.add(4,2);
            numbers.add(5,3);
            numbers.add(6,7);
            numbers.add(7,1);
            numbers.add(8,10);


            Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
            for (int i : numbers) {  //for every number in array
                Integer j = countMap.get(i); // this line is void. resets counter
                countMap.put(i, (j == null) ? 1 : j + 1); //ternary
            }

            System.out.println("Duplicates: " + countMap);
        }

}


