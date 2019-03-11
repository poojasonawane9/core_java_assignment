import java.util.Scanner;
public class IncomeTax {
	public static void main(String[] args){
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter salary");
		int salary = scanner.nextInt();
		scanner.close();
		float taxAmount=0;
		if(salary >= 0 && salary <= 180000){
			System.out.println("No tax amount");
		}
		else if(salary >= 181001 && salary <= 300000){
			taxAmount = salary * 0.1f;
			System.out.println("Tax amount =" +taxAmount);
		}
		else if(salary >= 300001 && salary <= 500000){
			taxAmount = salary * 0.2f;
			System.out.println("Tax amount =" +taxAmount);
		}
		else if(salary >= 500001 && salary <= 1000000){
			taxAmount = salary * 0.3f;
			System.out.println("Tax amount =" +taxAmount);
		}
	}
}
