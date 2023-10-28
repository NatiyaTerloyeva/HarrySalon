package Salon;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class VacantHours {
    Scanner in = new Scanner(System.in);
    public String vacantReason;
    public int occupiedHours;


    //GETTERS/SETTERS

    public String getVacantReason() {
        return vacantReason;

    }

    public void setVacantReason(String vacantReason) {
      this.vacantReason = vacantReason;

    }

    public int getOccupiedHours() {
        return occupiedHours;

    }

    public void setOccupiedHours(int occupiedHours) {
        this.occupiedHours = occupiedHours;

    }

    public VacantHours() {
        System.out.println(" Whats the reason for vacant hours?: ");
        setVacantReason(in.nextLine());
        System.out.println("How many hours will you be away?: ");
        setOccupiedHours(in.nextInt());
    }

    public String toString() {
        return "VacantHours{" +
                "VacantReason='" +vacantReason + '\'' +
                ", occupiedHours=" + occupiedHours +
                '}' ;

    }
}
