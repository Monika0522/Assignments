package week1.day2;

public class FindOddNumber {

	public static void main(String[] args) {
		int maxRange =10;
		System.out.println("Maxrange value is "+ maxRange );
//Finding odd numbers//
		for(int i=0; i<=maxRange; i++) {
			if(i%2==1) {

				System.out.println("Number " + i + " is odd");
			}

		}
//Finding even numbers//
		for (int j = 0; j<=maxRange; j++) {

			if(j%2==0) {
				System.out.println("Number " + j + " is even");
			}
		}

	}
	}


