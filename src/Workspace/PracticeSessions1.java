package Workspace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeSessions1 {

    public static void main(String[] args) {
        reverseAnIntegerList();
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
}
