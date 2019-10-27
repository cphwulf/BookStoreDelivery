package bookstoredelivery;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class BookTest {
	Book myBook;
	double price;
	//String[] subjects = {"United States"};
	String[] subjects;
	
	@Before
	public void setUp() {
		subjects = new String[] {"United States"};
		price = 230.50;
		myBook = new Book("150008-academic:ebr10331296","Engelsk","Susan Estrich","Getting away with murder : how politics is destroying the criminal justice system",subjects);
		myBook.setPrice(price);
			
			}
	
	@Test
	public void testSomeMethod() {
		double expected = price;
		double actual = myBook.getPrice();
		assertEquals(expected, actual,0.001);

	}
	
}
