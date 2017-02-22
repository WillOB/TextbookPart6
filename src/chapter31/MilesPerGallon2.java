package chapter31;

import java.util.Scanner ;

public class MilesPerGallon2
{
  public static void main( String[] args ) 
  {
    Scanner scan = new Scanner(System.in);
    
    int startMiles;
    int miles;
    double gallons;

    System.out.println("New car odometer reading:");
    startMiles = scan.nextInt();
    
    System.out.println("Filling Station Visit");
    
    System.out.print("odometer reading" ); 
    miles = scan.nextInt();

    System.out.print("gallons to fill tank" ); 
    gallons = scan.nextDouble();

    Car2 car = new Car2(startMiles);

    car.fillUp(miles, gallons);
    System.out.println( "Miles per gallon: " + car.calculateMPG() );
    if(car.economyCar())
    	System.out.println("Economy car!");
    else if(car.gasHog())
    	System.out.println("Gas hog.");
  }
}