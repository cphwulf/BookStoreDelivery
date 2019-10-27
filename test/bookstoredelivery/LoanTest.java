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
		/*
		        postnr: 9600,
        by: Aars,
        kortnavn: Vesthimmerlands Biblioteker,
        væsensnavn: Vesthimmerlands Biblioteker,
        adresse: Søndergade 24,
        latitude: 56.802403,
        bibliotekstype: Folkebibliotek,
        "id": "782000",                                                                                                                                               
        longitude: 9.51731,
        navn: Aars bibliotek
		*/

		// bookline:
		//{"type":"book","Id":"150008-academic:ebr10331296","language":"Engelsk","creator":"Susan Estrich","title":"Getting away with murder : how politics is destroying the criminal justice system","su":"United States"} 
		// loanline:
		// {"materiale_id": "870970-basis:51267699", "laaner_id": 0, "koen": "k", "biblioteks_id": 782000, "dato": "2015-03-04", "foedselsaar": "1973-01-01"}
		String[] subjects = {"for 12 år","for 11 år","for 9 år", "sk","science fiction","Skønlitteratur",    "for 10 år"}; 
		price = 230.50;
		loanDate = LocalDate.parse("2015-03-04");
		bornDate = LocalDate.parse("1973-01-01");
		myBook = new Book("870970-basis:51267699","Dansk","Sussi Bech","Gustav og Raketbroderskabet",subjects);
		myBook.setPrice(price);
		myLoaner = new Loaner("Random Name", 0,"k", bornDate);
		myAddress = new Address("Søndergade 24","9600","Aars",56.802403,9.51731);
		myLibrary = new Library("782000","Folkebibliotek","Vesthimmerlands Biblioteker","Vesthimmerlands Biblioteker",myAddress);
		myLoan = new Loan(myBook,myLoaner,myLibrary,loanDate);
	}

	@Test
	public void testSomeMethod() {
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
