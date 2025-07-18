package sam_pac;
import java.util.*;

public class Hello {
	public static void main(String[] args) {
		int[] nums= {6,5,2,8,3,7};int temp;
		for(int i=0;i<nums.length-1;i++) {
			int max = nums[0];int index=0;
			for(int j=0;j<nums.length-i;j++) {
				if(max<nums[j]) {
					max=nums[j];index=j;
				}
			}
			temp = nums[nums.length-i-1];
			nums[nums.length-i-1] = max;
			nums[index] = temp;
			
		}
		System.out.println(Arrays.toString(nums)); 
	}
}
