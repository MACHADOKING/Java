package program4.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date check_in;
    private Date check_out;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date check_in, Date check_out) {
        this.roomNumber = roomNumber;
        this.check_in = check_in;
        this.check_out = check_out;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return check_in;
    }

    public Date getCheckOut() {
        return check_out;
    }

    public Long duration() {
        long diff = check_out.getTime() - check_in.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) {
        this.check_in = checkIn;
        this.check_out = checkOut;
    }

    @Override
    public String toString() {
        return "Room: " + roomNumber + ", check-in: " + sdf.format(check_in) + ", check-out: " + sdf.format(check_out)
                + ", " + duration() + " nights.";
    }
}
