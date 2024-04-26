package hust.soict.globalict.aims.media;

public class Track implements Playable{
	private String title;
	private int length;
	
	public Track() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @param length
	 */
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	public void play() {
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) { // If they refer to the same object in memory
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) { // Check for null and class type
	        return false;
	    }
		Track track = (Track) obj;
		if(this.getTitle().equals(track.getTitle()) && this.getLength() == track.getLength()) {
			return true;
		}else {
			return false;
		}
	}
}
