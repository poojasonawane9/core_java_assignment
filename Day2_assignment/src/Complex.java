public class Complex{
	private double real;
	private double imaginary;
	
	public void setComplexNumber(double real,double imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}

	public void displayComplexNumber(){
		System.out.println(real + "+ i" +imaginary);
	}

	public Complex sumComplexNumber(Complex c){
		Complex cSum= new Complex();
		cSum.real = this.real + c.real;
		cSum.imaginary = this.imaginary + c.imaginary;
		return cSum;
	}
} 
	

	