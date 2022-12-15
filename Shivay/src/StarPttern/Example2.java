package StarPttern;

public class Example2 {

	public static void main(String[] args) {
		//* * * * *
		//* * * * *
		//* * * * *
		//* * * * *
		//rows-->4, star-->5 columns -->5
		//outer for loop for rows 
		for(int i=1;i<=4;i++) {
			//single row--> i want 5 star to be printed
			for(int j=1;j<=5;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
