class Distance{
	private int feet;
	private float inches;
		

	public void set(int feet, float inches)
	{
		this.feet = feet;
		this.inches= inches;

	}

	public void display()
	{
		System.out.println("The total distance covered is " +feet +" feet " +inches +" inches");
		
	}

	public Distance addTotal(Distance d1)
	{
		Distance d2 = new Distance();
		d2.feet = this.feet + d1.feet;	
		d2.inches = this.inches + d1.inches;
		return d2;

	}

}