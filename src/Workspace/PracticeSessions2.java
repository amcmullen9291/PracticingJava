package Workspace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PracticeSessions2  {


    public static void main(String[] args) {
        getTypeOfVariable("Good Morning");
        getTypeOfVariable(12_553);
        getTypeOfVariable(5_236_776_900L);
        getTypeOfVariable(1F);
        getTypeOfVariable(1.3333333333F);
        getTypeOfVariable(1.0001000500D);
        getTypeOfVariable("anthony"=="Anthony");
        getTypeOfVariable('b');
        //user can't MAKE/use an array, hashMap, etc. without the programmer knowing it

//        countArrayDuplicates();
    }

    public static void getTypeOfVariable(Object input){
        System.out.print(((Object) input).getClass().getSimpleName()); //readable version
        System.out.println(": " + input);
    }

        public static void countArrayDuplicates() {
            ArrayList<Integer> numbers = new ArrayList();
            numbers.add(0,1);
            numbers.add(1,1);
            numbers.add(2,1);
            numbers.add(3,2);
            numbers.add(4,2);


            Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

            for (int i = 0; i < numbers.size(); i++) {
                int key = numbers.get(i);
                if (countMap.containsKey(key)) {
                    int count = countMap.get(key);
                    count++;
                    countMap.put(key, count); // Hashes can't have two duplicate keys with different values
                } else {                    //with different values
                    countMap.put(key, 1); //so key is overwritten until final value is obtained
                }
            }
            System.out.print("Duplicate results:");
            System.out.println(countMap);
        }
    }


