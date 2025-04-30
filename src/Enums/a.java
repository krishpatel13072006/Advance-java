package Enums;

public enum a {

    green(0),red(1),blue(2),yellow(3);

    int number;
    private a(int number)
    {
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {

        a s[]=a.values();
        for (a x:s)
        {
            System.out.println(x.getNumber()+" = "+x);
        }

        a x=a.red;
        System.out.println(x.ordinal()+" "+x.toString());
    }

}
