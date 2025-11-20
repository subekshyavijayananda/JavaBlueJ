import java.util.Scanner;

/**
 * Write a description of class RickshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RickshawFare
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int BaseFare=100;
        int Charge=20; //per km
        int MinuteCharge=5; //per minute
        System.out.println("Enter distance:");
        int distance=scan.nextInt();
        System.out.println("Enter travel time:");
        int time=scan.nextInt();
        System.out.println("Is the customer a local? :");
        String local=scan.next();
        boolean islocal=local.equals("Yes")?true:false;
        System.out.println("Is this travel during night? :");
        String night=scan.next();
        boolean isnight=night.equals("Yes")?true:false;
        int Finalfare=BaseFare + (distance*Charge) + (time*MinuteCharge);
        System.out.println("Total fare:"+Finalfare);
    }
}