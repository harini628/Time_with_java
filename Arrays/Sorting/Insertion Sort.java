package sam_pac;
import java.util.*;

public class Hello {
	public static void main(String[] args) {
		int[] arr= {3,6,2,1,5};
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] = key;
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
