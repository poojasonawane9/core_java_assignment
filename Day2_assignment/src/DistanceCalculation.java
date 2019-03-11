public class DistanceCalculation{
	int feet;
	double inches;
	public void setDistance(int feet,double inches){
		this.feet = feet;
		this.inches = inches;
	}

	public void displayDistance(){
		System.out.println("Feet = "+feet+","+"Inches = "+inches);
	}

	public void sumDistance(DistanceCalculation d1,DistanceCalculation d2){
		feet = d1.feet + d2.feet;
		inches = d1.inches + d2.inches;
	} 
} 