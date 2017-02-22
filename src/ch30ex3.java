import java.util.Scanner;
class HelloObject3
	{
		String greeting;
		HelloObject3(String st){
			greeting = st;
		}
		
		void speak()
		{
			System.out.println(greeting);
		}
	}
	
	class HelloTester3
	{
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Greeting: ");
			String greeting = scan.nextLine();
			HelloObject3 anObject = new HelloObject3(greeting);
			anObject.speak();
		}
	}