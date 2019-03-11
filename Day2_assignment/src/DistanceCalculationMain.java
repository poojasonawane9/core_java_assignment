public class DistanceCalculationMain{
	public static void main(String[] args){
		
		DistanceCalculation distance = new DistanceCalculation();
		distance.setDistance(4,5);
		distance.displayDistance();

		DistanceCalculation distance1 = new DistanceCalculation();
		distance1.setDistance(3,5);
		distance1.displayDistance();

		DistanceCalculation distance2 = new DistanceCalculation();
		distance2.sumDistance(distance,distance1);
		System.out.println("Total distance is ");
		distance2.displayDistance();
		
		
	}
}