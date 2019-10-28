package bookstoredelivery;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;

/**
 *
 * @author thor
 */
public class LoanTest {
	Book myBook;
	Loan myLoan;
	Library myLibrary;
	Address myAddress;
	Loaner myLoaner;
	double price;
	String[] subjects;
	LocalDate loanDate, bornDate;
	
	@Before
	public void setUp() {
		String[] subjects = {"for 12 år","for 11 år","for 9 år", "sk","science fiction","Skønlitteratur",    "for 10 år"}; 
		price = 230.50;
		loanDate = LocalDate.parse("2015-03-04");
		bornDate = LocalDate.parse("1973-01-01");
		myBook = new Book("870970-basis:51267699","Dansk","Sussi Bech","Gustav og Raketbroderskabet",subjects);
		myBook.setPrice(price);
		myLoaner = new Loaner(0,"k", bornDate);
		myAddress = new Address("Søndergade 24","9600","Aars",56.802403,9.51731);
		myLibrary = new Library("782000","Folkebibliotek","Vesthimmerlands Biblioteker","Vesthimmerlands Biblioteker",myAddress);
		myLoan = new Loan(myBook,myLoaner,myLibrary,loanDate);
	}


	/**
	 * Test of setReturnDate method, of class Loan.
	 */
	@Test
	public void testSetReturnDate() {
		System.out.println("setReturnDate");
		int daysOfLoan = 0;
		Loan instance = null;
		LocalDate expResult = null;
		LocalDate result = instance.setReturnDate(daysOfLoan);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getId method, of class Loan.
	 */
	@Test
	public void testGetId() {
		System.out.println("getId");
		Loan instance = null;
		int expResult = 0;
		int result = instance.getId();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getLoanDate method, of class Loan.
	 */
	@Test
	public void testGetLoanDate() {
		System.out.println("getLoanDate");
		Loan instance = null;
		LocalDate expResult = null;
		LocalDate result = instance.getLoanDate();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getReturnDate method, of class Loan.
	 */
	@Test
	public void testGetReturnDate() {
		System.out.println("getReturnDate");
		LocalDate expResult = LocalDate.parse("2015-04-04");
		LocalDate result = myLoan.getReturnDate();
		assertEquals(expResult, result);
	}

	/**
	 * Test of toString method, of class Loan.
	 */
	@Test
	public void testToString() {
		System.out.println("toString");
		String expResult = "";
		String result = myLoan.toString();
		assertEquals(expResult, result);
	}
	
}
