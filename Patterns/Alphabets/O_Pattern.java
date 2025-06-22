
public class Learn {

    
    public static void main(String[] args) {
        
        for(int i = 1;i<11;i++){
            for(int j =1;j<11;j++){
                if((j==1) || (j==10) || (i==1) || (i==10) ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }System.out.println();
        }
    }
    
}
