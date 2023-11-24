package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {
	
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	// Create constructor
	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}
	
	public CompactDisc(int id, String title, String category, float cost, String director, int length) {
        super(id, title, category, cost, director, length);
    }
	
	// Add track
	public void addTrack(Track track) {
		if (tracks.contains(track)) {
			System.out.println("The track is already in the list.");
			return;
		} else {
			tracks.add(track);
			System.out.println("The track has been added.");
		}
	}
	
	// Remove track
	public void removeTrack (Track track) {
		if (tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("The track has been removed.");
		} else {
			System.out.println("The track is not in the list.");
		}
	}

	@Override
	public int getLength() {
		int total_length = 0;
		for (Track i: tracks)
			total_length += i.getLength();
		return total_length;
	}
	
	// Create getter and setter
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
}
