package hust.soict.globalict.aims.media;

import java.util.List;
import java.util.ArrayList;


public class CompactDisc extends Disc implements Playable{
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}
	
	/**
	 * @param artist
	 * @param tracks
	 */
	public CompactDisc(int id, String title, String category, float cost, String director, int length,String artist, List<Track> tracks) {
		super(id, title, category, cost, director, length);
		this.artist = artist;
		this.tracks = tracks;
	}
	
	public void addTrack(Track track) {
		for(int i = 0; i< tracks.size();i++) {
			if( tracks.get(i) == track) {
				System.out.println("Track already existed.");
				return;
			}
		}
		tracks.add(track);
		System.out.println("Added successfully");
	}
	public void removeTrack(Track track) {
		for(int i =0; i< tracks.size(); i++) {
			if(tracks.get(i) == track) {
				tracks.remove(i);
				System.out.println("Removed successfully");
				return;
			}
		}
		System.out.println("Track doesn't exist.");

	}
	public int getLength() {
		int length = 0;
		for(int i =0; i < tracks.size(); i++) {
			length += tracks.get(i).getLength();
		}
		return length;
	}
	
	public void play() {
		for(Track track : tracks) {
			track.play();
		}
	}
	public String toString() {
		return "CD - " + super.getTitle() + " - " + super.getCategory() + " - " + super.getDirector() + " - " + super.getLength() +":" + super.getCost() + '$';
	}
}
