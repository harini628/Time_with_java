import java.util.Arrays;
import java.util.Scanner;

public class Mult_arrelements {
    /*
    int multiple(int arr[], int n){
        int result = 1; 
        for(int i = 0; i<arr.length ; i++){
            if(arr[i] != n){
                result = result * arr[i];
            }
        }
        return result;
    }*/

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of the array:");
       int n = sc.nextInt();
       int arr[] = new int[n];
       System.out.println("Enter the array elements: ");
       for(int j=0; j<n ; j++){
           arr[j] = sc.nextInt();
       }
       int res[] = new int[arr.length],product = 1;
       //Mult_arrelements obj = new Mult_arrelements();
       for(int i =0; i<arr.length ; i++){
           //res[i] = obj.multiple(arr, arr[i]);
           product = product * arr[i];
       }
       for(int j = 0; j<arr.length ; j++){
           res[j] = product / arr[j];
       }
       System.out.println("The result is: " + Arrays.toString(res));
    }
    
}
