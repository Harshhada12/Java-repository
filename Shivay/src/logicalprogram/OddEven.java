package logicalprogram;

public class OddEven {

	public static void main(String[] args) {
		int a []= {1,2,3,6,9};
		
		int even=0;
		int odd=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
			System.out.println(even);
			//System.out.println(odd);
		}
		System.out.println();
	}

}
