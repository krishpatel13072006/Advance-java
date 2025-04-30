package Collection_Framework.Arraylist;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.Comparable;

public class Main {

    public static void main(String[] args) {

        List<Main> x=new ArrayList<>();

        List<Integer> ob = Arrays.asList(1,2,4,3,5);
       /* ob.set(4,12);
        System.out.println(ob.get(4));*/


        List<Integer> obj=new ArrayList<>(ob);
        obj.add(1,2);
        obj.add(12);
        obj.add(12);
        obj.add(12);
        obj.add(12);
        obj.add(12);
        obj.add(12);
        obj.add(12);
        obj.add(12);


        System.out.println(obj.size());

        obj.removeFirst();
        System.out.println(obj);

        obj.removeLast();
        System.out.println(obj);

        /*obj.clear();
        System.out.println(obj);*/

        obj.set(0,1);
        System.out.println(obj);

//        obj.sort(null);
        Collections.shuffle(obj);
        Collections.sort(obj);
        System.out.println(obj);

        System.out.println(obj.contains(Integer.valueOf(1)));

        List<Integer> n = List.of(1, 2, 3, 4, 5);
        List<Integer> b=List.copyOf(n);
//        b.add(1);
        System.out.println(b);













       /* for (int i = 0; i <ob.size() ; i++) {
            System.out.println(ob.get(i));
        }*/

       /* for (int i:ob)
        {
            System.out.println(i);
        }*/



    }


}
