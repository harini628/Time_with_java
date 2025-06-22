import java.util.Scanner;
public class JavaApplication35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        int x = 1;
        for (int i=1 ; i<=n ; i++){
            for(int j=1; j<=n ; j++){
                if(i==1 || i==n){
                    System.out.print(x);
                }
                else if(j==1 && (i>1 && i<n )){
                    System.out.print(i);
                }
                else if(j==n && (i>1 && i<n)){
                    System.out.print(n);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }  
    }
    
}
