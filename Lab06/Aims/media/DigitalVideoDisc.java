package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Media {
	private String director;
	private int length;
	
	
	
	// constructor
	public DigitalVideoDisc (String title) {
		super(title);
	}
	
	public DigitalVideoDisc(String title, String category) {
		super(title, category);
	}
	
	public DigitalVideoDisc(String title, String category, String director) {
		super(title, category);
		this.director = director;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	
	// method 
	private Boolean search(String title) {
		String[] titleSearch = title.split(" ");
        for (int i = 0; i < titleSearch.length; i++) {
            if (super.getTitle().toLowerCase().indexOf(titleSearch[i].toLowerCase()) < 0) 
                return false;
        }
        return true;
	}
		
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	
}
