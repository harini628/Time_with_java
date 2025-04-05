import java.util.Scanner;
public class Learn {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = n%10;
        n = n/10;
        boolean flag = true;
        while(n>10){
            int x = n%10;
            if(x>y){
                flag = false;
                break;
            }
            y = x;
            n = n/10;
        }
        if(flag == true){
            System.out.println("The given number is in assending order");
        }else{
            System.out.println("The given number is not in assending order");
        }
        
    }
    
}
