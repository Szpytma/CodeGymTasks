package pl.codegym.task.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Usługi sprzątające
*/

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        // Napisz tutaj swoją implementację Punktów 1-4
        for (Apartment app : apartments) {
            if (app instanceof OneRoomApt) {
                ((OneRoomApt) app).clean1Room();
            } else if (app instanceof TwoRoomApt) {
                ((TwoRoomApt) app).clean2Rooms();
            } else if (app instanceof ThreeRoomApt) {
                ((ThreeRoomApt) app).clean3Rooms();
            }

        }

    }

    interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("Posprzątano 1 pokój");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("Posprzątano 2 pokoje");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("Posprzątano 3 pokoje");
        }
    }
}
