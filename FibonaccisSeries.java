package week1.day2;

import java.util.Iterator;

public class FibonaccisSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		System.out.println(n1 + "," +n2  );
		int count = 8;
		int n3;
		
for (int i = 2; i <=count; ++i) {
	n3=n1+n2;
	System.out.println(+n3); 
	n1=n2;
	n2=n3;


}
		
		

	}

}
