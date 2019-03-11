public class TimeMain{
	public static void main(String[] args){
		Time time = new Time();
		time.setTime(4,20);
		time.displayTime();
	
		Time time1 = new Time();
		time1.setTime(1,30);
		time1.displayTime();

		Time time2 = new Time();
		time2.sumTime(time,time1);
		System.out.println("Total time is");
		time2.displayTime();
	}
}