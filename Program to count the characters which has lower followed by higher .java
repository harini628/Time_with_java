package javaapplication39;
import java.util.Scanner;

public class JavaApplication39 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a String: ");
       String str = sc.nextLine();int count = 0;
       for(int i = 0;i<str.length();i++){
           char x = str.charAt(i);
           if(x >= 'A' && x<= 'Z'){
               for(int j = i+1; j<str.length();j++){
                   char y = str.charAt(j);
                   if(y >= 'a' && y<= 'z'){
                       count++;
                   }else{
                       break;
                   }
               }
               break;
           }
       }
        System.out.println(count);
       
       
    }
    
}
