public class Odd_count {
    public static void main(String[] args) {
       int arr[] = {7,6,3,88,54,22,9,4,1},count = 0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]%2 != 0){
               count++;
           }
       }
       int count_even = arr.length - count;
       System.out.println("Even count: " + count_even );
       System.out.println("Odd count: "+count);
    }
    
}
