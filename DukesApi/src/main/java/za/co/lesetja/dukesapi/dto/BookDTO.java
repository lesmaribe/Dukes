package za.co.lesetja.dukesapi.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement
public class BookDTO {

	private int id;
	private String authorName;
	private String authorSurname;
	private String authorTitle;
	private String title;
	private double price;
	private boolean onSale;
	private int year;
	private String description;
	private int copies;
	
	public BookDTO(){
	}

	/**
	 * @return int
	 */
	@XmlElement(required = true)
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return String
	 */
	@XmlElement(name = "author_name")
	@JsonProperty("author_name")
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * @param authorName
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	/**
	 * @return String
	 */
	@XmlElement(name = "author_surname")
	@JsonProperty("author_surname")
	public String getAuthorSurname() {
		return authorSurname;
	}

	/**
	 * @param authorSurname
	 */
	public void setAuthorSurname(String authorSurname) {
		this.authorSurname = authorSurname;
	}

	/**
	 * @return String
	 */
	@XmlElement(name = "author_title")
	@JsonProperty("author_title")
	public String getAuthorTitle() {
		return authorTitle;
	}

	/**
	 * @param authorTitle
	 */
	public void setAuthorTitle(String authorTitle) {
		this.authorTitle = authorTitle;
	}

	/**
	 * @return String
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return double
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return boolean
	 */
	public boolean isOnSale() {
		return onSale;
	}

	/**
	 * @param onSale
	 */
	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}

	/**
	 * @return int
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return String
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return int
	 */
	public int getCopies() {
		return copies;
	}

	/**
	 * @param copies
	 */
	public void setCopies(int copies) {
		this.copies = copies;
	}
}
