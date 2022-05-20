package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class AirlineReservationSystem {
    private static boolean[] seats = new boolean[10];



    private static int firstClassSeat = 0;
    private static int economyClassSeat = 5;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //seats[0] = true;

//        int quit = -1;
//        for (int i = 0; i < seats.length; i++) {
//            System.out.println("1 for first class, 2 for economy, -1 to quit: ");
//            int option = input.nextInt();
//            switch (option) {
//                case 1 -> {
//                    seats[i] = true;
//                    if (seats[i] && i < 5) {
//                        firstClassSeat++;
//                    }
//                }
//                case 2 -> {
//                    seats[i] = true;
//                    if (seats[i] && i > 5) {
//                        //firstClassSeat++;
//                        economyClassSeat++;
//                    }
//                }
//                default -> System.out.println("invalid selection");
//            }
//
//        }
        allocateClassSeat();
        //set();
       // setEconomyClassSeat();
        System.out.println(Arrays.toString(seats));
        System.out.println(firstClassSeat);
        System.out.println(economyClassSeat);

    }

    public static void allocateClassSeat() {
        for (int i = 0; i < 10; i++) {
            System.out.println("enter option: ");
            int option = input.nextInt();
            if (option == 1 && i < 5) {
                seats[i] = true;
                firstClassSeat++;
                if (firstClassSeat == 5){
                    System.out.println("first class full");
                }
            }  if (option == 2 && 9 > i) {
                seats[i] = true;
                economyClassSeat++;
                if (economyClassSeat == 10){
                    System.out.println("economy class full");
                }
                //} else {setEconomyClassSeat();}
            }
        }
    }

    public static void setFirstClassSeat() {
        for (int i = 0; i < 5; i++) {
            System.out.println("enter option: ");
            int option = input.nextInt();
            if (option == 1 && i < 5) {
                seats[i] = true;
                firstClassSeat++;
                if (firstClassSeat == 5) {
                    System.out.println("first class full");
setEconomyClassSeat();
                }
            }
        }
    }
    public static void set(){
        setFirstClassSeat();
        setEconomyClassSeat();
    }
        public static void setEconomyClassSeat () {
            for (int i = economyClassSeat; i < 10; i++) {
                System.out.println("enter option: ");
                int option = input.nextInt();
                 if (option == 2 && 9 > i) {
                    seats[i] = true;
                    economyClassSeat++;
                    if (economyClassSeat == 10){
                        System.out.println("economy class full");
                        setFirstClassSeat();
                    }
                    //} else {setEconomyClassSeat();}
                }
            }
        }


}
