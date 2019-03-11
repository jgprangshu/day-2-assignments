class Television{
	private boolean stateOfTelevision;
	private int currentVolume;
	private int currentChannel;

	public void state(boolean stateOfTelevision)
	{
		this.stateOfTelevision=stateOfTelevision;
		
		if(stateOfTelevision)
		{
		System.out.println("Changing the state of television to on");
		}
		else
		{
		System.out.println("Cannot turn on");
		System.exit(0);
		}
	}

		public int volumeChange(int currentVolume)
		{
			this.currentVolume = currentVolume;
			return currentVolume;
		}
	
		public int channelChange(int currentChannel)
		{
			this.currentChannel = currentChannel;
			return currentChannel;
		}
		
		public void display()
		{
			System.out.println("The current volume is " +currentVolume);
			System.out.println("The current channel is " +currentChannel);
			
	
		}

	

}

	





