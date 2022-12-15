package Logical;

public class ReverseNumWithoutConvert {

	public static void main(String[] args) {
	int number=1234;
	int rev=0;
//	System.out.println(number%10);
//	int n1=number/10;
//	System.out.println(n1);
//	System.out.println(n1%10);
//	int n2= n1/10;
//	System.out.println(n2);
//	System.out.println(n2%10);
//	int n3=n2/10;
//	System.out.println(n3);
//	System.out.println(n3%10);
	for(int i=number;i>0;i=i/10) {//1234,123,12,1
		int rem=i %10;//4,3,2,1
	 rev= rev*10+rem;
	 //4=0+4;
	 //43=40+3;
	 //432=430+2;
	 //4321=4320+1;
		
	}
	System.out.println(rev);
	}

}
