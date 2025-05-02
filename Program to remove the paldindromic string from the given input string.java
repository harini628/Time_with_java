package javaapplication38;
import java.util.Scanner;

public class JavaApplication38 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine(); String word = ""; String result = "";
        for(int i=0;i<str.length();i++){
            char x = str.charAt(i);
            if(x != ' ' ){
                word = word + x;
            }
            else{
                //System.out.println(word);
                int count = 0;
                for(int j=0; j<word.length()/2 ;j++){
                    String a = (word.charAt(j)+"").toUpperCase();
                    String b = (word.charAt(word.length()-1-j)+ "").toUpperCase();
                    if(a.equals(b)){
                        count++;
                    }
                }
                if(count != (word.length()/2)) {
                    result = result + " " + word ;
                }
                word = "";
            }
        }
        int count = 0;
                for(int j=0; j<word.length()/2 ;j++){
                    char a = word.charAt(j);
                    char b = word.charAt(word.length()-1-j);
                    if((a+"").equals(b+"") ){
                        count++;
                    }
                }
                if(count != (word.length()/2)) {
                    result = result + " " + word ;//In India Malayalam is best with dad and mom
                }
                result = result.trim();
                System.out.println(result);
    }
    
}
