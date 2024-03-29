package Aims;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	public DigitalVideoDisc(String title) {
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category,  float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director,   float cost) {
		this.title = title;
		this.director = director;
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, int length,  float cost) {
		this.title = title;
		this.director = director;
		this.category = category;
		this.cost = cost;
		this.length = length;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * @return the cost
	 */
	public float getCost() {
		return cost;
	}
}





