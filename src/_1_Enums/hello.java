package _1_Enums;

class hello {
    public static void main(String[] args) {

        System.out.println(days.monday);
        System.out.println(days.tuesday);

        days mon = days.monday;
        System.out.println(mon.ordinal());
        System.out.println(mon.name().toUpperCase());

        System.out.println(days.valueOf("monday"));//check sin enums and return named constant if its present in enum.

        days x[] = days.values();
        for (days n : x) {
            System.out.println(n);
        }
    }
}
