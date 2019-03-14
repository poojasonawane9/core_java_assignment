package main;

public class Triangle{
	
	private int side1;
	private int side2;
	private int side3;

	public Triangle(int side1,int side2,int side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public boolean isRightAngle(){
		int hypotenuse;
		int side;
		int base;

		if(side1 > side2 && side1 > side3){
			hypotenuse = side1;
			side = side2;
			base = side3;
		}
		else if(side2 > side3){
			hypotenuse = side2;
			side = side1;
			base = side3;
		}
		else{
			hypotenuse = side3;
			side = side2;
			base = side1;
		}

		if ((hypotenuse * hypotenuse)==(side * side)+(base * base)){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isScalene(){
		if((side1 != side2 && side1 != side3) && (side2 != side3)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isIsosceles(){
		if(side1 == side2){
			return true;
		}
		else if(side1 == side3){
			return true;
		}
		else if(side2 == side3){
			return true;
		}
		else{
		return false;
		}
	}
	
	public boolean isEquilateral(){
		if(side1 == side2 && side1 == side3 && side2 == side3){
			return true;
		}
		else{
			return false;
		}
	}
}