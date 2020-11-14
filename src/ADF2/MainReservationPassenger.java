package ADF2;

import java.util.Scanner;

public class MainReservationPassenger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String id;
        String name;
        String address;
        String phone;
        String dateDeparture;
        String dateReturn;
        ReservationPassenger reservationPassenger = new ReservationPassenger();
        do {
            System.out.println("Choose option: ");
            System.out.println("1. Insert Reservation");
            System.out.println("2. Clean Reservation");
            System.out.println("3. Search Reservation");
            System.out.println("4. Peek Reservation");
            System.out.println("5. Poll Reservation");
            System.out.println("6. Remove Reservation");
            System.out.println("7. Update Reservation");
            System.out.println("8. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter your name: ");
                    name = sc.nextLine();
                    System.out.println("Enter your address: ");
                    address = sc.nextLine();
                    System.out.println("Enter your phone: ");
                    phone = sc.nextLine();
                    System.out.println("Enter your date departure : ");
                    dateDeparture = sc.nextLine();
                    System.out.println("Enter your date return : ");
                    dateReturn = sc.nextLine();
                    reservationPassenger.add(new Reservation(name, address, phone, dateDeparture, dateReturn));
                    reservationPassenger.show();
                    break;
                case 2:
                    reservationPassenger.clean();
                    break;
                case 3:
                    System.out.println("Enter your reservation id: ");
                    id = sc.nextLine();
                    reservationPassenger.find(id);
                    break;
                case 4:
                    reservationPassenger.peek();
                    break;
                case 5:
                    reservationPassenger.poll();
                    break;
                case 6:
                    System.out.println("Enter your reservation id: ");
                    id = sc.nextLine();
                    reservationPassenger.remove(id);
                    reservationPassenger.show();
                    break;
                case 7:
                    System.out.println("Enter your name: ");
                    name = sc.nextLine();
                    System.out.println("Enter your address: ");
                    address = sc.nextLine();
                    System.out.println("Enter your phone: ");
                    phone = sc.nextLine();
                    System.out.println("Enter your date departure : ");
                    dateDeparture = sc.nextLine();
                    System.out.println("Enter your date return : ");
                    dateReturn = sc.nextLine();
                    reservationPassenger.update(name, phone, address, dateDeparture, dateReturn);
                    reservationPassenger.show();
                    break;
                case 8:
                    System.exit(0);
                default:
                    break;
            }
        } while (true);
    }
}
