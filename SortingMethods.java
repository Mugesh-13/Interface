package interfaceAssignment;
import java.util.*;
public class SortingMethods {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int len=scan.nextInt();
		int [] arr=new int[len];
		for(int i=0;i<len;i++) {
			System.out.println("Enter the value of element "+(i+1));
			arr[i]=scan.nextInt();
		}
		System.out.println("Which Sorting Operation you need to do.." +"\n" +"1.Bubble Sort" +"\n" +"2.Quick Sort"+"\n"+"3.Merge Sort");
		int n=scan.nextInt();
		switch(n) {
		case 1:
			BubbleSort obj1=new BubbleSort();
			obj1.sort(arr);
			break;
		case 2:
			QuickSort obj2=new QuickSort();
			obj2.sort(arr);
			break;
		case 3:
			MergeSort obj3=new MergeSort();
			obj3.sort(arr);
			break;
		default:
			System.out.println("Enter valid Input");
		}
		
	}
	
}
