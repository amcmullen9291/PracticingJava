package Workspace;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class PracticeSessions2  {


    public static void main(String[] args) {
        getTypeOfVariable("Good Morning");
        getTypeOfVariable(12_553);
        getTypeOfVariable(5_236_776_900L);
        getTypeOfVariable(1F);
        getTypeOfVariable(1.0001D);
        getTypeOfVariable(5_334F);
        getTypeOfVariable(5_444);
        getTypeOfVariable("anthony"=="Anthony");
        getTypeOfVariable('b');
        //user can't MAKE/use an array, hashMap, etc. without the programmer knowing it
    }

    public static void getTypeOfVariable(Object input){
        System.out.print(((Object) input).getClass().getSimpleName()); //readable version
        System.out.println(": " + input);

    }


}
