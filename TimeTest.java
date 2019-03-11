class TimeTest{

	public static void main(String[] args)
	{
		Time object1 =new Time();
		object1.setTime(10,30);
		object1.showTime();

		Time object2 =new Time();
		object2.setTime(2,45);
		object2.showTime();
		
		Time object3 ;
		object3 = object1.sum(object2);
		object3.showTime();


	}


}