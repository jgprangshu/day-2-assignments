class ComplexTest{

		public static void main(String[] args)
		{

			Complex object1= new Complex();
			Complex object2= new Complex();
			

			object1.set(5,6);
			object1.display();
			
			object2.set(4,7);
			object2.display();
                        
                        Complex object3;
                        object3 = object1.complexSum(object2);			
			object3.display();
			
		}


}