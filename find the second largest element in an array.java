public class Second_largest {

    
    public static void main(String[] args) {
        int arr[] = {5,8,2,88,79,87,7},max = arr[0],result = arr[0];
        for(int i = 1 ;i<arr.length;i++){
            if(arr[i] > max){
                result = max;
                max = arr[i];
            }else if(arr[i] < max && arr[i] > result){
                result = arr[i];
            }
        }
        /*
        for(int j=0;j<arr.length;j++){
            if(arr[j] < max && arr[j] > result){
                result = arr[j];
            }
        }*/
        System.out.println("Second largest number: " + result);
    }
    
}
