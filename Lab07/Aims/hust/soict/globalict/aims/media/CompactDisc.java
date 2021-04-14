package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();

	
	// constructor
	public CompactDisc(String title, String category, float cost, int length, String director, String artist, ArrayList<Track> tracks) {
		super(title, category, cost, length, director);
		this.artist = artist;
		this.tracks = tracks;
	}

	
	// method
	public void addTrack(Track track) {
		for (int i = 0; i < tracks.size(); i++) {
			if (tracks.get(i).getTitle().equals(track.getTitle()) && tracks.get(i).getLength() == track.getLength()) {
				System.out.println("This " + track.getTitle() + " is already in the list.");
				break;
			} else {
				tracks.add(track);
				System.out.println("This " + track.getTitle() + " is added to the list.");
			}
		}
	}
	
	public void removeTrack(Track track) {
		for (int i = 0; i < tracks.size(); i++) {
			if (tracks.get(i).getTitle().equals(track.getTitle()) && tracks.get(i).getLength() == track.getLength()) {
				tracks.remove(track);
				System.out.println("This " + track.getTitle() + " is removrd from the list.");
				break;
			} else {
				System.out.println("This " + track.getTitle() + " is not in the list.");
			}
		}
	}
	
	public int getLength() {
		int totalLength = 0;
		for (int i = 0; i < tracks.size(); i++) {
			totalLength += tracks.get(i).getLength();
		}
		return totalLength;
	}

	public void play() {
		for (int i = 0; i < tracks.size(); i++) {
			tracks.get(i).play();
		}
	}
	
	// getter
	public String getArtist() {
		return artist;
	}


}
