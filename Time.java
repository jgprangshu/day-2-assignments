class Time{
     
	private int hours;
	private int minutes;

	public void setTime(int hours, int minutes)
	{
		this.hours = hours;
		this.minutes = minutes;
	}
	
	public void showTime()
	{
		System.out.println("The total hours is " +hours +" and total minutes are " +minutes);

	}
	
	public Time sum(Time c2)
	{
		Time c3 = new Time();
		c3.hours = this.hours + c2.hours;
		c3.minutes = this.minutes + c2.minutes;

		if(c3.minutes >30)
		{
		c3.minutes = c3.minutes-60 ;
		c3.hours +=1;
		}	
		return c3;


	}



}