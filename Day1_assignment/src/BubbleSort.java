import java.util.Scanner;
public class BubbleSort {
	static void bubbleSort(int[] array){
		int size = array.length;
		for(int i=0;i<size;i++){
			for(int j=0;j<size-1;j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many elements you want");
		int totalElements = scanner.nextInt();
		int array[] = new int[totalElements];
		System.out.println("Enter elements ");
		for(int elements = 0;elements < totalElements;elements++){
			array[elements]=scanner.nextInt();
		}
		System.out.println("Array before sorting");
		for(int elements = 0;elements < totalElements;elements++){
			System.out.println(array[elements]);
		}
		bubbleSort(array);
		
		System.out.println("Array after sorting");
		for(int elements = 0;elements < totalElements;elements++){
			System.out.println(array[elements]);
		}
		scanner.close();
	}
}
