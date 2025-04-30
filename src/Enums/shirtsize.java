package Enums;

public enum shirtsize  {

    x(10),xl(20),m(15),l(25),small(12);

    int number;

    private shirtsize(int number)
    {
        this.number=number;
    }

    public int getNumber() {
        return number;
    }




    public static void main(String[] args) {

        shirtsize j=shirtsize.x;
        System.out.println(j.name());
        shirtsize num[]=shirtsize.values();
        for (shirtsize c:num)
        {
            System.out.println( c+ " = "+c.getNumber());
        }



    }

    }

