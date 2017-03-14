package chapter35;

class Pantry
{
  // Instance Variables
  private Jam  jar1 ;
  private Jam  jar2 ;
  private Jam  jar3 ;
  private Jam  selected ;

  // Constructors
  Pantry( Jam jar1, Jam jar2, Jam jar3 )
  {
    this . jar1 = jar1 ;
    this . jar2 = jar2 ;
    this . jar3 = jar3 ;
    selected = null ;
  }

  Pantry(Jam jar1, Jam jar2){
	  this.jar1 = jar1;
	  this.jar2 = jar2;
	  jar3 = null;
  }
  
  Pantry(Jam jar){
	  this.jar1 = jar;
	  jar2 = null;
	  jar3 = null;
  }
  
  // Methods
  public void print()
  {
	if(jar1 != null){
    System.out.print("1: "); jar1 . print() ;
	}
    if(jar2 != null){
    System.out.print("2: "); jar2 . print() ;
    }
    if(jar3 != null){
    System.out.print("3: "); jar3 . print() ;
    }
  }

  // assume that the user entered a correct selection, 1, 2, or 3
  public boolean select( int jarNumber )
  {
    if ( jarNumber == 1 )
      selected =  jar1 ;
    
    else if ( jarNumber == 2 )
      selected = jar2 ;

    else 
      selected = jar3 ;
    
    if(selected == null)
    	return false;
    else return true;
  }

  // spread the selected jam
  public void spread( int oz )
  {
    selected . spread( oz ) ;
  }
  
  public void replace(Jam j, int slot){
	  if(slot == 1){
		  jar1 = j;
	  }
	  if(slot == 2){
		  jar2 = j;
	  }
	  if(slot == 3){
		  jar3 = j;
	  }
  }
  
  public void mixedFruit(){
	  if(jar1.capacity <= 2 && jar2.capacity <= 2 && jar3.capacity <= 2 && jar1 != null
			  && jar2 != null && jar3 != null){
		  jar1 = new Jam("Mixed fruit", jar1.date, jar1.capacity + jar2.capacity +
				  jar3.capacity);
		  jar2 = jar3 = null;
	  }
  }
}