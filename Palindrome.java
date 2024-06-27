package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		//Declare the input value in variable
		int input = 454; 
        int num = input;
        int output = 0;
        int rem;
          
     // Using the For loop to Reverse the number 
        for (int i = input; i != 0; i=i/10) 
        {
            rem = i % 10;
            output = output * 10 + rem;
        }
     // Compare the Input and output to check the number is palindrome or not
        
        if (num == output) 
        {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }

	}
	}


