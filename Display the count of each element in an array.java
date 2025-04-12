import java.util.Scanner;

public class Learn {
    int count(int x , int arr[]){
        int res = 0;
        for (int n = 0 ; n < arr.length ; n++){
            if(arr[n] == x){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Learn ln = new Learn();
        int n;
        System.out.print("Enter the size of the array :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int result = 0;
        boolean flag ;
        int sort[] = new int[n];
        for (int i = 0;i < n ;i++){
            flag = false;
            for(int k =0 ; k < sort.length ; k++){
                if(arr[i] == sort[k]){
                    flag = true;
                }
            }
            if(flag == false ){
                sort[i] = arr[i];
                result = ln.count(arr[i], arr);
                System.out.println(arr[i] + " -> " + result );
            }
            
            
        }
    }
    
}
