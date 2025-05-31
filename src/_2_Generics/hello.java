package _2_Generics;
import java.util.ArrayList;
public class hello {

    public static void main(String[] args) {

        //before generics
        ArrayList s=new ArrayList<>();//collections can store any type of data
        s.add(0,"hello" );
        s.add(1, 123);

       /* String s1=(String) s.get(1);//manually type cast
       System.out.println(s1);//throws run time error*/

        ArrayList<String> lsit=new ArrayList<>();
        lsit.add(0,"hello");

        // gives compile time error
       // list.add(1,123);





    }
}
