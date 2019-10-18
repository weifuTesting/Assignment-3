package IT7320.A3partC;

import java.util.ArrayList;

public class Library {
	ArrayList<Book> bookList = new ArrayList<Book>();

	public Library() {
	}
	
	public ArrayList addBook(Book book) {
		bookList.add(book);
		return bookList;
		
	}

	public Boolean checkTitle(int iSBN) { 
		for (Book book : bookList) {
			
			if (book.isBN == iSBN) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList checkOut(int iSBN) { 
		int index = 0;
		int pos = -1;
		for (Book book : bookList) {
			
			if (book.isBN == iSBN) {
				pos = index;
			}
			index++;
		}
		if (pos != -1) {
			bookList.remove(pos);
		}
		return bookList;
	}

}
