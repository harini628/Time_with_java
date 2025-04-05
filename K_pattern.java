public class Learn {

    public static void main(String[] args) {
        
        for(int i = 1;i<10;i++){
            for(int j =1;j<7;j++){
                if((j==1)|| ((j==6) && (i==1||i==9)) || ((j==5) && (i==2 || i==8)) || ((j==4) && (i==3||i==7)) || ((j==3)&&(i==4||i==6)) || ((j==2)&&(i==5)) ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
    
}
