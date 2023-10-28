package Salon;

import java.util.Scanner;

public class CustomerAppointment {
    Scanner in = new Scanner(System.in);

    private String firstName;
    private String phone;
    private int dataDay;
    private int dateMonth;
    private int datetime;
    private Product product;


    boolean hasPaid = true;

    // GETTER/SETTER

    public String getFirstName() {
        return firstName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public String getPhone() {
        return phone;

    }

    public void setPhone(String phone) {
        this.phone = phone;

    }

    public int getDateDay() {
        return dataDay;

    }

    public void setDataDay(int dateDay) {
        this.dataDay= dateDay;

    }

    public int getDateMonth() {
        return dateMonth;

    }

    public void setDateMonth(int dateMonth) {
        this.dateMonth = dateMonth;

    }

    public boolean hasPaid() {
        return hasPaid;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;

    }

    public CustomerAppointment() {
        System.out.println("Please enter name of the Customer?");
        setFirstName(in.nextLine());
        System.out.println("Please enter phone number: ");
        setPhone(in.nextLine());
        System.out.println("Please enter which date: ");
        setDataDay(in.nextInt());
        System.out.println("Please enter which month: ");
        setDateMonth(in.nextInt());
        System.out.println("Please enter the price: ");
        setTotalAmountOfSale(in.nextInt());

    }

    public String toString() {
        return "CustomerAppointment{" +
                "firstName='" + firstName + '\'' +
                ", phone='" + phone + '\'' +
                ", dateDay=" + dataDay +
                ",dateMonth=" + dateMonth +
                ", hasPaid=" + hasPaid +
                '}';
    }

    public void setName(String name) {
    }

    public void setTotalAmountOfSale(double totalAmountOfSale) {

    }

    public void deleteAppointment() {

    }
}
