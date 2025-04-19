public class JavaApplication34 {
    public static void main(String[] args) {
        
        int arr[] = {1,2,4,1,2,8};
        int res = arr[arr.length-1];
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = i-1 ; j >= 0 ; j-- ){
                if(arr[i] == arr[j]){
                    res = arr[i];
                    break;
                }
            }
            if(res == arr[i] && i!= arr.length-1){
                break;
            }
        }
        if(res > 0){
            System.out.println(res);
        }else{
            System.out.println(0);
        }    
    }
    
}
