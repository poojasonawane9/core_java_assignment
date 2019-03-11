import java.util.Scanner;

public class Armstrong{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int number1=scanner.nextInt();
		scanner.close();
		int sum = 0;
		int count = 0;
		int checkNumber = number1;
		while(checkNumber != 0){
			checkNumber /= 10;
			count++;
		}
		checkNumber = number1;
		while(checkNumber > 0){
			int temp=0;
			temp = checkNumber % 10;
			sum += Math.pow(temp, count);
			checkNumber /=10;
		}
		if(number1 == sum){
			System.out.println("Number is armstrong");
		}
	}
}