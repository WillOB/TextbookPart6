package chapter31;

public class Car
{
	  // instance variables
	  double startMiles;   // Stating odometer reading
	  double endMiles;     // Ending odometer reading
	  double gallons;      // Gallons of gas used between the readings

	  // constructor
	  Car( double first, double last, double gals )
	  {
	    startMiles = first ;
	    endMiles   = last ;
	    gallons    = gals ;
	  }

	  // methods
	  double calculateMPG()
	  {
	    return (endMiles - startMiles)/gallons ;
	  }
	  
	  boolean gasHog(){
		  return this.calculateMPG() < 15.0;
	  }
	  
	  boolean economyCar(){
		  return this.calculateMPG() > 30.0;
	  }

}