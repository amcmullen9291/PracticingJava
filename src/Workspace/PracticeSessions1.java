package Workspace;

import java.util.*;
public class PracticeSessions1 {

    public static void main(String[] args) {
//        insertIntoAString("welcome to America!");
//        reverseAnIntegerList();
//        findMissingNumber();
        removeDuplicatesFromArray();
    }

    public static void insertIntoAString(String words){
        String additionalString = "INSERTED WORDS in";
        String replacementString = words.replace("welcome",additionalString);
        System.out.println(replacementString);
        reverseWords("Continue .2");
    }

    public static void reverseWords(String word){
        String newWord = new StringBuffer(word).reverse().toString();
        System.out.println(newWord);
                ArrayList<Integer> list = new ArrayList<>();
                list.add(413_546_999);

        reverseOneNumber(list);
    }

    public static void reverseOneNumber(ArrayList<Integer> numbersList){
        String numberWord = "";
        for(int number: numbersList){  //only works for one number, not a list
            String a = String.valueOf(number);
            numberWord += numberWord+a;
        }
        String reversedNumberChain = new StringBuffer(numberWord).reverse().toString();
        System.out.print("Hopefully the reverse number chain is: ");
        System.out.println(reversedNumberChain);
    }

    public static void reverseAnIntegerList(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(500);
        list.add(6000);
        list.add(5280);

        System.out.println(list);  //easy,easy,easy!
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void findMissingNumber(){
        int[] numbers = { 11, 6, 4, 5, 7, 1, 15, 12, 13, 19 };
        Arrays.sort(numbers);
        ArrayList solution = new ArrayList();
        int index = 0;
        int solutionsIndex = 0;
        for (int i = 0; i < numbers[numbers.length - 1]; i++) {
            if (i == numbers[index]) {
                index++; //the length() turned into comparing indexes
            }           //the index number is the same number as the position in the array
            else {
                solution.add(solutionsIndex,i);
                solutionsIndex++;
            }
        }
        if(solution.isEmpty()){  //if nothing missing
            solution.add(0,0);
        }
        System.out.println(solution);
    }

    public static void removeDuplicatesFromArray(){
        Set<Integer> set = new HashSet<Integer>(); //Sets can only have unique values
        int[] array = {1,1,2,2,2,3,3,4,5,6,8};
        new ArrayList<>(Arrays.asList(array)); //changes array to an arrayList
//        ---------- or ---------------
//      same thing as above done manually

//        ArrayList<Integer> array2 = new ArrayList();
//        array2.add(1);
//        array2.add(1);
//        array2.add(2);
//        array2.add(2);
//        array2.add(2);
//        array2.add(3);
//        array2.add(3);
//        array2.add(4);
//        array2.add(5);
//        array2.add(6);
//        array2.add(8);

        for (int num : array) {
            set.add(num);  //forces only unique values
        }
        set.toArray();
        System.out.println(set);
    }
}
