import java.util.Scanner;
public class SimpleAndCompound {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter principle value");
		float principle = scanner.nextInt();
		System.out.println("Enter period");
		int period=scanner.nextInt();
		System.out.println("Enter rate of interest");
		float rate=scanner.nextInt();
		scanner.close();
		float simpleInterest=(principle*period*rate)/100;
		System.out.println("Simple Interest is= "+simpleInterest);
		float data = (1+ rate/100);
		float compoundInterest = (float)(principle * Math.pow(data, period));
		System.out.println("Simple interest is =" + compoundInterest);
	}
}
