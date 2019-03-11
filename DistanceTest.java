class DistanceTest{
	
	public static void main(String[] args)
	{
		Distance object1= new Distance();
		object1.set(4,5);
		object1.display();

		Distance object2= new Distance();
		object2.set(7,5);
		object2.display();

		Distance object3;
		object3 = object1.addTotal(object2);
		object3.display();

		
	}






}