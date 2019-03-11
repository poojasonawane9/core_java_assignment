public class Time{
	int hours;
	int minutes;
	public void setTime(int hours,int minutes){
		this.hours = hours;
		this.minutes = minutes;
	}

	public void displayTime(){
		System.out.println("hours= "+hours+","+"minutes= "+minutes);
	}

	public void sumTime(Time time3,Time time4){
		hours = time3.hours + time4.hours;
		minutes = time3.minutes + time4.minutes;
	}
} 