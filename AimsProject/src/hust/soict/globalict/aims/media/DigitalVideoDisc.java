package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	
	public DigitalVideoDisc(int id, String title, String category, float cost, String director, int length) {
		super(id, title, category, cost, director, length);
	}
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	public String toString() {
		return "DVD - " + super.getTitle() + " - " + super.getCategory() + " - " + super.getDirector() + " - " + super.getLength() +":" + super.getCost() + '$';
	}
	
}





