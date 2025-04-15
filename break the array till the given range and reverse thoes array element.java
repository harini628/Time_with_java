import java.util.Arrays;
import java.util.Scanner;


public class JavaApplication33 {
    
    public static void main(String[] args) {
        int arr[] = {1,7,9,3,2,8,5,6};
        int res[] = new int[arr.length];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of d: ");
        int d = sc.nextInt();
        int j = 0;
        for(int i = d; i>= 0 ; i--){
            res[j] = arr[i];
            j++;
        }
        for(int k=arr.length-1 ; k > d ; k--){
            res[j]=arr[k];
            j++;
        }
        System.out.println(Arrays.toString(res));
    }
    
}
