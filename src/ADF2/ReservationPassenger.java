package ADF2;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ReservationPassenger {

    private ArrayList<Reservation> reservations = new ArrayList<>();

    private PriorityQueue<Reservation> reservationPriorityQueue = new PriorityQueue<>();

    boolean add(Reservation reservation) {
        reservationPriorityQueue.add(reservation);
        System.out.println("Insert success");
        return false;
    }

    void clean() {
        reservationPriorityQueue.clear();
    }

    void poll() {
        System.out.println(reservationPriorityQueue.poll());
    }

    void peek() {
        System.out.println(reservationPriorityQueue.peek());
    }

    void show() {
        for (Reservation r : reservations) {
            System.out.println(r.toString());
        }
    }

    boolean find(String id) {
        for (Reservation r : reservationPriorityQueue) {
            if (r.getReservationId().equals(id)) {
                System.out.println("PassengerName: " + r.getPassengerName() + "Address: " + r.getAddress() + "Phone: " + r.getPhone() + "Date departure: " + r.getDateDeparture() + "Date return: " + r.getDateReturn());
                return true;
            }
        }
        System.out.println("Reservation not found");
        return false;
    }

    void remove(Reservation reservation) {
        reservationPriorityQueue.remove(reservation);
        System.out.println("Reservation : " + reservation.getReservationId() + " delete success!");
    }

    void update(String name, String phone, String address, String dateDeparture, String dateReturn) {
        for (Reservation reservation : reservationPriorityQueue) {
            if (reservation.getPassengerName().equals(name)) {
                reservation.setPhone(phone);
                reservation.setAddress(address);
                reservation.setDateDeparture(dateDeparture);
                reservation.setDateReturn(dateReturn);
                return;
            }
        }
    }
}
