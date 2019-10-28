package bookstoredelivery;
import java.time.LocalDate;
import Util.IdFactory;

/**
 *
 * @author thor
 */
public class Loaner {
	//myLoaner = new Loaner("Random Name", 0,"k", bornDate);
	int id;
	String name;
	String gender;
	LocalDate bornDate;

	public Loaner(int id, String gender, LocalDate bornDate) {
		this.id = id;
		this.gender = gender;
		this.bornDate = bornDate;
		this.name = IdFactory.getRandomName(gender);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public LocalDate getBornDate() {
		return bornDate;
	}
	
}
