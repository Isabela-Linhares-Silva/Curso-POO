package exceptions3.applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exceptions3.model.entities.Reservation;
import exceptions3.model.exceptions.DomainException;
// metodo bom para tratamento de excessoes
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{ 
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date ci = sdf.parse(sc.next());// parse pode gerar uma excessão, ou trata ou propaga
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date co = sdf.parse(sc.next());

            
        
            Reservation reservation = new Reservation(number, ci, co);
            System.out.println("Reservation: "+reservation);

            System.out.println();
            System.out.println("Enter date to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy):");
            ci = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy):");
            co = sdf.parse(sc.next());
                        
            reservation.updateDates(ci, co);
            
            System.out.println("Reservation: "+reservation);
        } 
        catch (ParseException e) {
            System.out.println("Invalid date format");
        }
        catch(DomainException e){
            System.out.println("Error in reservation: "+e.getMessage());
        }
        catch(Exception e){
            System.out.println("Unexpected error");
        }
        sc.close();
    }
}
