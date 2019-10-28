package Util;
import  java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author thor
 */
public class IdFactory {
	private static int addressId = 10;
	private static int loanId = 10000;
	private  static String randomName;
	private static String femaleString = "Data/pigenavne.csv";
	private static String maleString = "Data/drengenavne.csv";
	private static String lastnameString = "Data/efternavne.csv";
	private static Scanner myScanner;
	private static File fh;
	
	
	public static int getLoanId() {
		return loanId++;
	}
	public static int getAddressId() {
		return addressId++;
	}
	
	public static String getRandomName(String gender) {
		switch(gender) {
			case "k":
				fh = new File(femaleString);
				try {
				Scanner myScanner = new Scanner(fh);
					randomName = myScanner.nextLine();
				} catch (Exception e) {
					System.out.println("Error "+ e.toString());
				}
				break;
			case "m":
				fh = new File(maleString);
				break;
			default:
				fh = new File(maleString);
				break;
		}
		try {
			fh = new File(lastnameString);
			myScanner = new Scanner(fh);
			randomName += " " + myScanner.nextLine();
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.toString());
		}
		return randomName;
	}
}
