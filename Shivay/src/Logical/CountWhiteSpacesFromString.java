package Logical;

public class CountWhiteSpacesFromString {

	public static void main(String[] args) {
		String s="ve  locit y";
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			char t = s.charAt(i);
			if(t==' ') {
				
			count++;
			
			}
		}
System.out.println("Number of bank spaces are"+count);
	}

}
