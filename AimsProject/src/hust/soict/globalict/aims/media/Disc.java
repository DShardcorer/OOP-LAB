package hust.soict.globalict.aims.media;

public class Disc extends Media {
	private String director;
	private int length;
	/**
	 * @param artist the artist to set
	 */
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
	 * @param director
	 * @param length
	 */
	public Disc(int id, String title, String category, float cost, String director, int length) {
		super(id, title, category, cost);
		this.director = director;
		this.length = length;
	}
	public String toString() {
		return "CD - " + super.getTitle() + " - " + super.getCategory() + " - " + director + " - " + length +":" + super.getCost() + '$';
	}
	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
}
