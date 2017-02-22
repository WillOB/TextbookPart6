
		class HelloObject4
		{
			String greeting;
			HelloObject4(String st){
				greeting = st;
			}
			HelloObject4(HelloObject4 object){
				greeting = object.greeting;
			}
			
			void speak()
			{
				System.out.println(greeting);
			}
		}
		
		class HelloTester4
		{
			public static void main(String[] args)
			{
				HelloObject4 anObject = new HelloObject4("hi");
				HelloObject4 object2 = new HelloObject4(anObject);
				anObject.speak();
				object2.speak();
			}
		}
