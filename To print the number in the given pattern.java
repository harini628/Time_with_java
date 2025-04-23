package javaapplication36;
import java.util.Scanner;

public class JavaApplication36 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int n = s.nextInt();
       int x = (2*n) - 1;
       int k = 1;
       for(int i = 1; i<2*n ; i++){
           for(int j = 1; j<2*n ; j++){
                if(i==1 || j==1 || i == (2*n)-1 || j == x ){
                   System.out.print(n);
                }else if( ( (i == 2 || i== x-1) && (j>1 && j<x) ) || ((j==2 || j==x-1) && (i<x && i>1) ) ){
                   System.out.print(n-1);
                }else if( ((i==3 || i==x-2) && (j>2 && j<x-1)) || ((j==3 || j==x-2) && (i>2 && i<x-1) ) ){
                   System.out.print(n-2);
                }else if( ((i==4 || i==x-3) && (j>3 && j<x-2)) || ((j==4 || j==x-3) && (i>3 && i<x-2) ) ){
                   System.out.print(n-3);
                }else{
                    System.out.print(n-4);
                }
            }System.out.println();
       }
       
        
    }
    
}
