package sam_pac;


public class Hello {
	
	public static void main(String[] args) {
		String s1 = "coaching";
		String s2 = "coding";
		int i=0;int j=0;
		while(i<s1.length() && j<s2.length()) {
			if(s1.charAt(i)==s2.charAt(j)) {
				j++;
			}
			i++;
		}
		System.out.print(s2.length()-j);
	}
}
