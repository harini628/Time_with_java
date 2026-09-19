public class BinarySearch {
	public static boolean flag;
	public static void main(String[] args) {
		int[] arr = new int[] {2,5,7,9,22,44,66,77};
		if(search(arr,0,arr.length-1,6))System.out.println("found");
		else System.out.println("Not Found");
		
	}
	
	public static boolean search(int[] arr,int l,int r,int n) {
		int mid = (l+r)/2;
		if(l<=r) {
			if(arr[mid] == n )flag = true;
			else if(arr[mid] > n)search(arr,l,mid-1,n);
			else if(arr[mid] < n) search(arr,mid+1,r,n);
		}
		return flag;
	}

}
