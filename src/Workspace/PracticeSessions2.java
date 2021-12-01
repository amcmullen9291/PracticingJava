package Workspace;

public class PracticeSessions2  {


    public static void main(String[] args) {
        getTypeOfVariable("Good Morning");
        getTypeOfVariable(12_553);
        getTypeOfVariable(5_236_776_900L);
        getTypeOfVariable(1.00F);
        getTypeOfVariable(5_3333333333334D); //double
        getTypeOfVariable("anthony"=="Anthony");
        getTypeOfVariable('b');

    }

    public static void getTypeOfVariable(Object input){
        System.out.println(((Object) input).getClass().getSimpleName()); //readable version
    }


}
