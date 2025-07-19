import java.util.*;

public class Hello {
	
	public static void quicksort(int[] arr,int low,int high) {
		if(low<high) {
			int pvt = partition(arr,low,high);
			quicksort(arr,low,pvt-1);
			quicksort(arr,pvt+1,high);
		}
	}
	private static int partition(int[] arr,int low,int high) {
		int i=low-1;int pivort = arr[high];
		for(int j=low;j<high;j++) {
			if(pivort > arr[j]) {
				i++;
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		int tem = arr[high];
		arr[high]=arr[i+1];
		arr[i+1]=tem;
		return i+1;
	}
	
	public static void main(String[] args) {
		int[] arr= {53,3,36,197,4,24};
		quicksort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
