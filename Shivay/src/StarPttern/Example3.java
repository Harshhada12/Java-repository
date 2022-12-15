package StarPttern;



public class Example3 {

	public static void main(String[] args) {
		//*
		//**
		//***
		//****
		//*****
		//rows-->5, 1st row condition star=1
		int star=1;
		for(int i=1;i<=5;i++) {
			//inner for loop
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
		}System.out.println();
		star++;
	}

}
