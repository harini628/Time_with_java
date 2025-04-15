import java.util.Scanner;

public class Learn {
    int max,index;
    Learn max_index(int n , int arr[]){
        Learn ln1 = new Learn();
        ln1.max = arr[0];
        ln1.index = 0;
        for (int i = 1; i<n ; i++){
            if(arr[i] > ln1.max){
                ln1.max = arr[i];
                ln1.index = i ;
            }
        }
        return ln1;
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[] = new int[n];
        for (int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        Learn ln = new Learn();
        Learn result = ln.max_index(n, arr);
        System.out.println("MAX: "+result.max);
        System.out.println("INDEX: " + result.index);
    }
    
}
