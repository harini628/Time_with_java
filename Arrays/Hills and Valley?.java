package sam_pac;
import java.util.*;


public class Hello {
	
	public static void main(String[] args) {
		int[] arr= {2 ,4, 1, 1, 6, 5};
		ArrayList<Integer> list_int = new ArrayList<Integer>();
		list_int.add(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]!=arr[i]) {
				list_int.add(arr[i]);
			}
		}
		System.out.println(list_int+"\n");
		int hill=0;int vally=0;
		for(int j=1;j<list_int.size()-1;j++) {
			int fst=list_int.get(j-1);int lst=list_int.get(j-1);int curr = list_int.get(j);
			if(curr>fst && curr>lst) {
				hill++;
			}else if(curr<fst && curr<lst)vally++;
		}
		System.out.println("HILL: "+hill + "\nVALLY: "+vally+"\nTOTAL:"+(hill+vally));
		
	}
}
