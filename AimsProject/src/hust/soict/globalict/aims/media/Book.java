package hust.soict.globalict.aims.media;
import java.util.List;
import java.util.ArrayList;

public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
	/**
	 * @param id
	 * @param title
	 * @param category
	 * @param cost
	 * @param authors
	 */

	
	public Book(int id, String title, String category, float cost, List<String> authors) {
		super(id, title, category, cost);
		this.authors = authors;
	}
	/**
	 * @return the authors
	 */
	public List<String> getAuthors() {
		return authors;
	}
	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public void addAuthor(String authorName) {
		for(int i = 0; i< authors.size();i++) {
			if( authorName.equals(authors.get(i))) {
				System.out.println("Author already existed.");
				return;
			}
		}
		authors.add(authorName);
		System.out.println("Added successfully");
	}
	public void removeAuthor(String authorName) {
		for(int i =0; i< authors.size(); i++) {
			if(authorName.equals(authors.get(i))) {
				authors.remove(i);
				System.out.println("Removed successfully");
				return;
			}
		}
		System.out.println("Author doesn't exist.");

	}
	public String toString() {
		String authorString = "";
		for(String author : authors) {
			authorString += (author + ", ");
		}
		return "Book - " + super.getTitle() + " - " + super.getCategory() + " - " + "Author(s): " +authorString  + " - " +":" + super.getCost() + '$';
	}
	
}
