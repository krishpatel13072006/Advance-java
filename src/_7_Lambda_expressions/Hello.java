package _7_Lambda_expressions;

//lambda functions fon not have any-- modifier,return-type,name
//only have (arrow) ->
public class Hello{

    public void show()
    {
        System.out.println("hello krish");
    }

    public static void main(String[] args) {
        show s1=()-> System.out.println("hello world!");
        s1.getmsg();

        sum n1=( a, b)->{
            System.out.println(a-b);
        };
        n1.getadd(10,10);

        print p1=(String str)-> {
            System.out.println(str.toUpperCase());
        };
        p1.len("krish");



    }
}

@FunctionalInterface
interface show{
    abstract void getmsg();
}

@FunctionalInterface
interface sum {
    public abstract void getadd(int a,int b);
}

@FunctionalInterface
interface print{
    public abstract void len(String str);
}