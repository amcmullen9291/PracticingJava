package Workspace;

import java.util.ArrayList;
import java.util.Collections;

public class MockInterview {
    public static  void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0,11);
        numbers.add(1,6);
        numbers.add(2,4);
        numbers.add(3,5);
        numbers.add(4,7);
        numbers.add(5,1);
        Collections.sort(numbers);
        ArrayList <Integer> solution = new ArrayList<>();
        int index = 0;
        for (int i = 1; i < numbers.get(numbers.size() - 1); i++) {
            if (!numbers.contains(i)) {
                solution.add(index,i);
                index++;
            }
        }
        if(solution.isEmpty()){
            solution.add(0,0);
        }
        System.out.println(solution);
        evenNumbers(); //first method
        evenNumbers(1.99F, 200.3F); //overloading method
        evenNumbers("eat more", "beef."); //overriding method
    }

        public static void evenNumbers() {
            int[] numbers = {
                    951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544,
                    615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941,
                    386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345,
                    399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217,
                    815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717,
                    958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470,
                    743, 527};

            for(int number: numbers){
                if(number > 237){
                    if(number%2 ==0){
                        System.out.println(number);
                    }
                }
            }
            double realAnswer = 12/9F;
            System.out.println(realAnswer);
        }

        public static void evenNumbers(Float number1, Float number2){
            double realAnswer = number1/number2;
            System.out.println("Double equals: " + realAnswer);
        }

        public static void evenNumbers( String name, String name2){
            System.out.println(name + " "+ name2);
            System.out.println("Is not overriding any method because it is not being inherited from a super class");
            System.out.println("Technically, it just has the same name. but its overloading the method?");
        }

}
