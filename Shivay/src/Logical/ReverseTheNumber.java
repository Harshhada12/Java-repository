package Logical;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int number=1234;
		String original=Integer.toString(number);//integer.tostring method is used to convert int into string
		String rev="";
		for(int i=original.length()-1;i>=0;i--) {
			char t=original.charAt(i);
			rev=rev+t;
			}
		System.out.println("original string is"+original);
		System.out.println("Reverse string is"+rev);
		int revNum=Integer.parseInt(rev);
		System.out.println("original Number is"+number);
		System.out.println("Reverse number is"+revNum);
	} 

}
