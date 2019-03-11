public class RectangleShape{
	
	private double length;
	private double breadth;

	public RectangleShape(double length,double breadth){
		this.length = length;
		this.breadth = breadth;
	}

	public double area(){
		return length * breadth;
	}
	
	public static void main(String[] args){
		RectangleShape rectangle = new RectangleShape(4,2);
		double area = rectangle.area();
		System.out.println("Area of rectangle = "+area);
		RectangleShape rectangle1 = new RectangleShape(2,2);
		double area2 = rectangle1.area();
		System.out.println("Area of rectangle = "+area2);

		if(area == area2){
			System.out.println("Both rectangle have same area");
		}
		else
			System.out.println("Both rectangle have different area");
		
	}
}