package chapter31;

public class Car2
{
	  // instance variables
	  int startMiles;   // Initial odometer reading
	  int miles; //current odometer reading
	  double gallons; //gallons put in at a fill up

	  // constructor
	  Car2( int firstReading)
	  {
	    startMiles = firstReading ;
	  }

	  // methods
	  double calculateMPG()
	  {
	    return (miles - startMiles)/ gallons ;
	  }
	  
	  boolean gasHog(){
		  return this.calculateMPG() < 15.0;
	  }
	  
	  boolean economyCar(){
		  return this.calculateMPG() > 30.0;
	  }

	  void fillUp(int newMiles, double addedGallons){
		  miles = newMiles;
		  gallons = addedGallons;
	  }
	  
	  void resetStartMiles(){
		  startMiles = miles;
	  }
}