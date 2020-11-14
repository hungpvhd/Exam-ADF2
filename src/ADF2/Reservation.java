package ADF2;

import java.util.UUID;

public class Reservation {

    private String reservationId;
    private String passengerName;
    private String address;
    private String phone;
    private String dateDeparture;
    private String dateReturn;

    public Reservation() {
    }

    public Reservation(String passengerName, String address, String phone, String dateDeparture, String dateReturn) {
        this.reservationId = UUID.randomUUID().toString();
        this.passengerName = passengerName;
        this.address = address;
        this.phone = phone;
        this.dateDeparture = dateDeparture;
        this.dateReturn = dateReturn;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(String dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public String getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(String dateReturn) {
        this.dateReturn = dateReturn;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", passengerName='" + passengerName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", dateDeparture='" + dateDeparture + '\'' +
                ", dateReturn='" + dateReturn + '\'' +
                '}';
    }
}
