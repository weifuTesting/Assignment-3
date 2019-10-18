package IT7320.A3partC;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class libraryTest {
	Book testBook;
	Library testLibrary ;
	int ISBN = 1;
	String title = "Book";
	ArrayList<Book> expected;
	ArrayList<Book> actual; //might not be updated cause errors.
	Boolean expectedCheck;
	Boolean actualCheck;
	ArrayList<Book> expectedCheckout;
	ArrayList<Book> actualActualCheckout;

	@Before
	public void setUp() throws Exception {
		testBook = new Book(title,ISBN);
		testLibrary = new Library();
		expected = new ArrayList<Book>();
		expected.add(testBook);
		actual = testLibrary.addBook(testBook);
		
		expectedCheck = true;
		actualCheck = testLibrary.checkTitle(ISBN);
		
		expectedCheckout = new ArrayList<Book>();
		actualActualCheckout = testLibrary.checkOut(ISBN);
		
	}
	
	
	@Test
	public void addBookTest() {
		assertEquals(expected,actual); //try arrays instead if arraylists dont work
	}
	
	@Test
	public void checkTitleTest(){
		System.out.println(testBook.title);
		testLibrary.addBook(testBook);
		assertEquals(expectedCheck,actualCheck); 				
	}
	
	@Test
	public void checkoutTest() {
		assertEquals(expectedCheckout,actualActualCheckout); 
		
	}
	

	@After
	public void tearDown() throws Exception {
		testBook = null;
		testLibrary = null;
	}


}
