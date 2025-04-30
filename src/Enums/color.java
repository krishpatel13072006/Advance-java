package Enums;

public enum color {
    green("safe"), red("danger"), yellow("wait");

    String meaning;
    private color(String meaning)
    {
        this.meaning=meaning;
    }

    public String getMeaning()
    {
        return meaning;
    }


    public static void main(String[] args) {


        color red=color.red;
        System.out.println(red.ordinal());//return order of occurring
        System.out.println(red.name());//works same as toString
        System.out.println(red.getMeaning());

        System.out.println();
        //to iterate all value of enum
        color[] s =color.values();
        for (color val: s)
        {
            System.out.println(val);
        }


    }


}
