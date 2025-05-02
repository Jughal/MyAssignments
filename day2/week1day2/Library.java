package week1.day2.week1day2;

public class Library {
		String addBook(String bookTitle) {
		bookTitle="Book added successfully";
		System.out.println(bookTitle);
		return bookTitle;
	}
		void issueBook(){
			System.out.println("Book issued successfully");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l=new Library();
		l.addBook("Java");
		l.issueBook();
	}

}
