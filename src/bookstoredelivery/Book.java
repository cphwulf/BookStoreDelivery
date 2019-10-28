/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package bookstoredelivery;

/**
 *
 * @author thor
 */
public class Book {
	//{"type":"book","Id":"150008-academic:ebr10331296","language":"Engelsk","creator":"Susan Estrich","title":"Getting away with murder : how politics is destroying the criminal justice system","su":"United States"}
	private final String id;
	private final String language;
	private final String creator;
	private final String title;
	private String[] subjects;
	private double price;

	public Book(String id, String language, String creator, String title, String[] subjects) {
		this.id = id;
		this.language = language;
		this.creator = creator;
		this.title = title;
		this.subjects = subjects;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public String getLanguage() {
		return language;
	}

	public String getCreator() {
		return creator;
	}

	public String getTitle() {
		return title;
	}
	
}
