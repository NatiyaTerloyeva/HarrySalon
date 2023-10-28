package Salon;

import java.util.Calendar;

public class Main {

    public void run() {
       Product shampoo = new Product("Shampoo", 15.75);
       Product hairbrush = new Product("Hairbrush", 50.00);
       Calender calender = new Calender();
       VacantHours weekendOff = new VacantHours();

        System.out.println(calender);
    }

    public static void main(String[] args) {
        new Main().run();
    }

}
