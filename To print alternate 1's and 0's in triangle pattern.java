public class JavaApplication35 {
    public static void main(String[] args) {
        int x = 1;
        for (int i=1; i<6 ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(x);
            }
            System.out.println();
            if(x==1){
                x=0;
            }else{
                x=1;
            }
        }
    }
    
}
