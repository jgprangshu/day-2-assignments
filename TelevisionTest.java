import java.util.*;

class TelevisionTest{
	
		public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);

			Television object1 = new Television();

			System.out.println("Press true to turn on!!");
			object1.state(sc.nextBoolean());	
			
			System.out.println("Enter the channel number which you want to watch");
			object1.channelChange(sc.nextInt());

			System.out.println("Enter the volume at which you want to listen");		
			object1.volumeChange(sc.nextInt());

			object1.display();
			
		}


}



