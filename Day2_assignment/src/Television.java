public class Television{
	boolean state;
	int channel;
	
	public Television(boolean state,int channel){
		this.state = state;
		this.channel = channel;
	}

	public void power(){
		if(state == true){
			System.out.println("your tv is on");	
		}	
		else{
			System.out.println("Your tv is off");
		}
	}

	public int forwardChannel(){
		channel++;
		return channel;			
	}

	public int backwardChannel(){
		channel--;
		return channel;			
	}
}
