package week1.day2;

public class Library {

	public static void main(String[] args) {
		Library obj1 = new Library(); //call methods using the object//
		String subject = obj1.addbook(null);
		obj1.issuebook();

	}
	//method addbook//
	public String addbook(String bookTitle) {
		System.out.println("Book added successfully");

		return(bookTitle);
	}
	//method issue book//
	public void issuebook() {
		System.out.println("Book issued successfully");

	}
}
