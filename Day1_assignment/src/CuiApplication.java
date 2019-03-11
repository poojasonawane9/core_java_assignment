import java.util.Scanner;
public class CuiApplication {
	public static void main(String[] args){
		Scanner scanner =new Scanner(System.in);
		String userName = "Admin";
		String passwordMain = "Admin";
		int count = 0;
		
		while(count < 3){
			System.out.println("Enter your user-id");
			String userId = scanner.nextLine();
			System.out.println("Enter your password");
			String password = scanner.nextLine();
			
			if(userName.equals(userId) && passwordMain.equals(password)){
				System.out.println("Welcome " + userName);
				break;
			}
			else{
				System.out.println("Wrong username and username");
			}
			count++;
		}
		if(count == 3){
			System.out.println("Contact Admin");
		}
		scanner.close();
}
}