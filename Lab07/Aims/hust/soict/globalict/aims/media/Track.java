package hust.soict.globalict.aims.media;

public class Track implements Playable {

	private String title;
	private int length;
	
	// constructor
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	
	// getter and setter
	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setLength(int length) {
		this.length = length;
	}

	// implement
	public void play() {
		System.out.println("Playing track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
		
	}
	
	

}
