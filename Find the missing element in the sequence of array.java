import java.util.Scanner;

public class Missing_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int x = sc.nextInt();
        int arr[] = new int[x],sum,sum_arr=0;
        System.out.println("Enter the array elements: ");
        for (int i = 0;i<x ;i++){
            arr[i] = sc.nextInt();
        }
        int n = arr[arr.length-1];
        /*
        for(int i=0;i<arr[arr.length-1];i++){
            sum = sum+i;
        }*/
        sum = n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            sum_arr= arr[i] + sum_arr;
        }
        int dif = sum - sum_arr;
        System.out.println("The Missing element is: " + dif);
        
    }
    
}
