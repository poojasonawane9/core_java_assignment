import java.util.Scanner;
public class TelevisionMain{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter OFF or ON to switch on and off television");
		String state = scanner.nextString();
		System.out.println("Enter channel number");
		int channel = scanner.nextInt();
		
		Television television = new Television(state,channel);
		television.power();
		System.out.println("Change channel in forward direction");
		System.out.println("Your channel no is= "+television.forwardChannel());
		System.out.println("Change channel in backward direction");
		System.out.println("Your channel no is= "+television.backwardChannel());
		
			
	}
}