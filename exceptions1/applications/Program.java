package exceptions1.applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exceptions1.entities.Reservation;
// metodo muito ruim para tratamento de excessoes
public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date ci = sdf.parse(sc.next());// parse pode gerar uma excessão, ou trata ou propaga
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date co = sdf.parse(sc.next());

        if (!co.after(ci)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }
        else{
            Reservation reservation = new Reservation(number, ci, co);
            System.out.println("Reservation: "+reservation);

            System.out.println();
            System.out.println("Enter date to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy):");
            ci = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy):");
            co = sdf.parse(sc.next());
            Date now = new Date();
            if (ci.before(now)|| co.before(now)) {
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            }
            else if (!co.after(ci)) {
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            }
            else{
                reservation.updateDates(ci, co);
            System.out.println("Reservation: "+reservation);
            }
            
        }
        
        sc.close();
    }
}
