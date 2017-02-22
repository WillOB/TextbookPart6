package chapter31;

public class Car2
{
	  // instance variables
	  double first;   // Initial odometer reading

	  // constructor
	  Car2( double firstReading)
	  {
	    first = firstReading ;
	  }

	  // methods
	  double calculateMPG(int miles, int prevMiles, int gallons)
	  {
	    return (miles - prevMiles)/ gallons ;
	  }
	  
	  boolean gasHog(){
		  return this.calculateMPG() < 15.0;
	  }
	  
	  boolean economyCar(){
		  return this.calculateMPG() > 30.0;
	  }

	  void fillUp(int miles, double gallons){
		  
	  }
}