package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc {
	
	// constructor
	public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
		super(title, category, cost, length, director);
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
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
		
//	public String getDirector() {
//		return director;
//	}
//	public void setDirector(String director) {
//		this.director = director;
//	}
//	public int getLength() {
//		return length;
//	}
//	public void setLength(int length) {
//		this.length = length;
//	}
	
	
}
