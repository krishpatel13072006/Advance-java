package Collection_Framework.LInkedlist;
import java.util.*;
public class Hello {

    public static void main(String[] args) {

        LinkedList<Integer> obj=new LinkedList<>(Arrays.asList(3,4,5,6,7,8,9));
        obj.add(10);
        obj.addFirst(0);
        obj.add(1,2);
        obj.addLast(11);

        System.out.println(obj);

        List<Integer> x=List.of(1,2);
        obj.removeAll(x);
        System.out.println(obj);

        List<Integer> x1=List.of(4,5,6,7);
        System.out.println(obj.contains(23));
        System.out.println(obj.containsAll(x1));

        obj.set(0,16);
        System.out.println(obj);

        for (Integer n: obj)
        {
            System.out.println(n);
        }



    }
}
