package javaapplication37;
import java.util.Scanner;

public class JavaApplication37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String result = "";int z = str.length()-1;
        for(int i=0 ; i< str.length();i++){
                char x = str.charAt(i);
                if(( (x >= 'a' && x <= 'z') || (x >= 'A' && x<='Z' ) || ( x >= '0' && x <='9' ) )){
                    char y = str.charAt(z);
                    if( (y >= 'a' && y <= 'z') || (y >= 'A' && y<='Z' ) || ( y >= '0' && y <='9' ) ){
                        result = result + y;
                    }
                    else{
                       while(!(y >= 'a' && y <= 'z') || (y >= 'A' && y<='Z' ) || ( y >= '0' && y <='9' )){
                           z--;
                           y = str.charAt(z);
                       }
                       
                       result = result + y;
                    }
                    z--;
                }
                else{
                    result = result + x;
                } 
        }
        System.out.println(result);
    }

}
