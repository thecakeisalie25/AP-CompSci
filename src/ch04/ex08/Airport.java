package ch04.ex08;
        
import java.util.Scanner;
        
public class Airport
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Flight nytsfFlight = new Flight(12345, "San Fransisco", "New York", "NorthEast");
        Flight abtcdFlight = new Flight(33314, "Centre de Disco", "Abrige de lundom", "GenericAir");

        System.out.println(nytsfFlight);
        System.out.println(abtcdFlight);
        
        input.close();
    }
}