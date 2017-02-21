
		class HelloObject
		{
			String greeting;
			HelloObject(String st){
				greeting = st;
			}
			
			void speak()
			{
				for (int i = 1; i <= greeting.length(); i++){
				System.out.println(greeting);
				}
			}
		}
		
		class HelloTester
		{
			public static void main(String[] args)
			{
				HelloObject anObject = new HelloObject("Hello");
				anObject.speak();
			}
		}