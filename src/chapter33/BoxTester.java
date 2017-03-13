package chapter33;

class BoxTester
{

  public static void main ( String[] args )
  {
     Box box = new  Box( 2.5, 5.0, 6.0 ) ;

     //exercise 1
     System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );

     //System.out.println( "length: " + box.length + " height: " + box. height +
     //                    " width:  " + box.width )  ;
     //that part won't compile because length, height, and width are private variables
     //I changed them to public so the tester class can see them
     
     //exercise 2
     System.out.println("Area: " + box.area2());
     //System.out.println("Top area: " + box.topArea());
     //This line won't compile because topArea() is private
     
     //exercise 3
     System.out.println( "length: " + box.length() + " height: " + box. height() +
                         " width:  " + box.width() )  ;
     Box box2 = new Box(2.5, 5.0, 6.0);
     System.out.println("New box area: " + box2.area());
     
     //exercise 4
     Box bigBox = box.biggerBox(box);
     System.out.println("Bigger box width: " + bigBox.width() + " height: " + bigBox.height()
     	+ " length: " + bigBox.length());
     Box smallBox = box.smallerBox(box);
     System.out.println("Smaller box width: " + smallBox.width() + " height: " + smallBox.height()
    		 + " length: " + smallBox.length());
     
     //exercise 5
     if(box.nests(bigBox))
    	 System.out.println("box fits inside bigBox");
     else
    	 System.out.println("Something is wrong");
     if(smallBox.nests(box))
    	 System.out.println("smallBox fits inside box");
     else
    	 System.out.println("Something is wrong");
     Box longBox = new Box(2.0, 2.0, 200.0);
     if(box.nests(longBox))
    	 System.out.println("Something is wrong");
     else
    	 System.out.println("box does not fit in longBox");
  }
}
