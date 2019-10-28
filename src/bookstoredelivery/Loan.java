package bookstoredelivery;
import Util.IdFactory;
import java.time.LocalDate;

/**
 *
 * @author thor
 */
public class Loan {
	private int id;
	private Book book;
	private Loaner loaner;
	private Library library;
	private LocalDate loanDate;
	private LocalDate returnDate;
	private int defaultLoanDays = 30;

	public Loan(Book book, Loaner loaner, Library library, LocalDate loanDate) {
		this.book = book;
		this.loaner = loaner;
		this.library = library;
		this.loanDate = loanDate;
		this.id = IdFactory.getLoanId();
		this.returnDate = setReturnDate(defaultLoanDays);
	}

	public LocalDate setReturnDate(int daysOfLoan) {
		return loanDate.plusDays(daysOfLoan);
	}

	public int getId() {
		return id;
	}

	public Book getBook() {
		return book;
	}

	public Loaner getLoaner() {
		return loaner;
	}

	public Library getLibrary() {
		return library;
	}

	public LocalDate getLoanDate() {
		return loanDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public String toString() {
		String retValString = "";
		retValString += "Title: " + book.getTitle();
		retValString += "BookedBy: " + loaner.getName();
		retValString += "Booked at: " + library.getShortName();
		retValString += "located in: " + library.getAddress().getPostalCity();
		retValString += "to be returned: " + this.returnDate;
		return retValString;
	}
	
}
