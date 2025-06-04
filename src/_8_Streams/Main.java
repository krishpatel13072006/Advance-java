package _8_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Collections.min;

public class Main {

    public static void main(String[] args) {

        List<Integer> obj= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> n1=new ArrayList<>();

       /* for(Integer x:obj)
        {
            if(x%2==0)
            {
                n1.add(x);
            }
        }*/

       n1= obj.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        System.out.println(n1);

        List<String> obj1=List.of("Krish","kalpesh","sajel","darshil");
        List<String> n2;
        n2=obj1.stream().filter(name -> name.toLowerCase().startsWith("k") && name.length()>=5).collect(Collectors.toList());
        System.out.println(n2);

        List<Integer> n3 = obj.stream()
                .filter(x -> x > 0)
                .map(i -> i * i)
                .sorted((a, b) -> a - b)
                .min((a, b) -> b.compareTo(a))
                .stream().limit(5)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(n3);

        Stream<Integer>ob=Stream.of(1,2,3,4,5,6,7,8,9,10);
        ob.forEach(i -> System.out.print(" "+i));

        Stream<Double>ob1= Stream.generate(()->Math.random()*100).limit(20);
        ob1.forEach(i-> System.out.println(i));

    }
}
