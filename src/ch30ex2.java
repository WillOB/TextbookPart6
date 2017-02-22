
		class HelloObject2
		{
			String greeting;
			HelloObject2(String st){
				greeting = st;
			}
			
			void speak()
			{
				System.out.println(greeting);
			}
		}
		
		class HelloTester2
		{
			public static void main(String[] args)
			{
				HelloObject2 morning = new HelloObject2("Good morning!");
				HelloObject2 evening = new HelloObject2("Good evening.");
				morning.speak();
				evening.speak();
			}
		}