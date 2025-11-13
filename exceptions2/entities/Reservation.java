package exceptions2.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private int roomNumber;
    private Date checkIn;
    private Date checkOut;

    public Reservation(int roomNumber,Date checkIn,Date checkOut){
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut= checkOut;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();//get time devolve o tempo em milisegundos
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);//converte os milisegundos em dias
    }

    public String updateDates(Date checkIn, Date checkOut){
        Date now = new Date();
        if (checkIn.before(now)|| checkOut.before(now)) {
        return "Error in reservation: Reservation dates for update must be future dates";
        }
        if (!checkOut.after(checkIn)) {
            return "Error in reservation: Check-out date must be after check-in date";
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null;
    }

    public String toString(){
        return "Room: "
        + roomNumber 
        + ", Check-in date: "
        + sdf.format(checkIn)
        +", Check-out date: "
        +sdf.format(checkOut)
        + ", "
        + duration()
        + " nights";
    }
}
