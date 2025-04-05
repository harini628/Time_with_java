public class Learn {

    public static void main(String[] args) {
        
        for(int i = 1;i<10;i++){
            for(int j =1;j<10;j++){
                if((j==1) || (j==9) || ((j==i)&&(j<6)) || (i==4 && j==6) || (i==3 && j==7) || (i==2 && j==8) ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }System.out.println();
        }
    }
    
}
