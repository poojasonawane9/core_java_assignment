import java.util.Scanner;
public class ResultOfSubject {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the marks of Physics");
		int physics = scanner.nextInt();
		System.out.println("Enter the marks of Chemistry");
		int chemistry = scanner.nextInt();
		System.out.println("Enter the marks of Math");
		int math = scanner.nextInt();
		scanner.close();
		if(physics > 60 && chemistry > 60 && math > 60){
			System.out.println("Passed");
		}
		else if((physics > 60 && chemistry > 60) ||(chemistry > 60 && math > 60)|| (physics > 60 && math > 60) ){
			System.out.println("Promoted");
		}
		else if((physics > 60 || chemistry > 60 || math > 60) || (chemistry < 60 && math < 60 && physics < 60)){
			System.out.println("Failed");
		}
	}
}
