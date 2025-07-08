public class Hello {
	
	public static void main(String[] args) {
		String s1 = "abcdefghijklmnopqrstuvwxyz";
		String s2 = "abc defghu ijklmnbop qrstuvw xyy yz".toLowerCase();
		int i=0;boolean flag = true;
		while(i<s1.length() && flag) {
			char y = s1.charAt(i);
			for(int j=0;j<s2.length();j++) {
				char x = s2.charAt(j);
				if(y==x) {
					break;
				}else if(j==s2.length()-1) {
					flag = false;
					break;
				}
			}
			i++;
		}
		if(flag)System.out.print("It is a Panagram ");
		else System.out.print("It is not a Panagram ");
	}
}
