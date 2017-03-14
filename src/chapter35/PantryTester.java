package chapter35;
import java.util.Scanner;

class PantryTester
{
	public static void main ( String[] args ){
	  Scanner scan = new Scanner(System.in);
	  
	  Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
	  Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
	  Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );
	  
	  System.out.println("Welcome to Mother Hubbard's Pantry!");
	  System.out.println("The jams are:");
	  
	  Pantry hubbard = new Pantry( goose, apple, rhub );
	  hubbard.print();
	  
	  boolean terminate = false;
	  while(!terminate){

	  System.out.println("Enter your selection (1, 2, or 3):");
	  int selection = scan.nextInt();
	  if(selection == -1){
		  System.out.println("Good-by");
		  terminate = true;
	  }
	  else{
		  while(selection < 1 || selection > 3){
			  System.out.println("Enter a number 1 to 3: ");
			  selection = scan.nextInt();
		  }
		  System.out.println("Enter amount to spread:");
		  int amount = scan.nextInt();

		  hubbard.select(selection);
	  	hubbard.spread(amount);
	  	hubbard.print();
	  }
	  }
  }
}
