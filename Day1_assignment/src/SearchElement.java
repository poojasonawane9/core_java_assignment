import java.util.Scanner;
public class SearchElement {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements in array");
		int totalElement = scanner.nextInt();
		int array[] = new int[totalElement];
		System.out.println("Enter elments");
		for(int element = 0;element < totalElement;element++){
			array[element] = scanner.nextInt();
		}
		System.out.println("Enter the element to be search");
		int searchElement = scanner.nextInt();
		scanner.close();
		for(int arrayElement = 0;arrayElement < totalElement;arrayElement++){
			if(array[arrayElement] == searchElement){
				System.out.println("Element found at = "+arrayElement);
			}
		}
		
	}
}
