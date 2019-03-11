public class ComplexMain{
	public static void main(String[] args){
		Complex complex = new Complex();
		complex.setComplexNumber(4,5);
		complex.displayComplexNumber();
		
		Complex complex1 = new Complex();
		complex1.setComplexNumber(5,4);
		complex1.displayComplexNumber();

		Complex complex2; 
                complex2 = complex.sumComplexNumber(complex1);
                complex2.displayComplexNumber();
	}
}