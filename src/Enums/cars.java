package Enums;

public enum cars implements hi{


    maruti
            {
                @Override
                public void show() {
                    System.out.println("its maruti baby!");
                }
            },
    honda
            {
                @Override
                public void show() {
                    System.out.println("its honda baby!");
                }
            },
    mercedes
            {
                @Override
                public void show() {
                    System.out.println("its honda baby!");
                }
            },
    bmw
            {
                @Override
                public void show() {
                    System.out.println("its honda baby!");
                }
            };


    public static void main(String[] args) {

        cars x=cars.maruti;
        x.show();

    }
}
