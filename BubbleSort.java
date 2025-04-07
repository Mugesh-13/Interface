package interfaceAssignment;

import java.util.Arrays;

public class BubbleSort implements Sorting{
	public void sort(int [] arr) {
		bubbleSort(arr);
		System.out.println("Bubble Sort");
		for(int x:arr) {
			System.out.print(x +",");
		}
		
	}
	public void bubbleSort(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}

