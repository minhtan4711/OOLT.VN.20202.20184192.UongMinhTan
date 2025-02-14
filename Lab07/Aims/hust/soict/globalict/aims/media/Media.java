package hust.soict.globalict.aims.media;

public abstract class Media {
	private String title;
	private String category;
	private float cost;
	private int id;
	
	
	// constructor
	public Media(String title) {
		this.title = title;
	}
	public Media(String title, String category) {
		this(title);
		this.category= category;
	}
	
	public Media(String title, String category, float cost) {
		this(title, category);
		this.cost = cost;
	}
	
	
	
	
	// getter and setter
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
		return id;
	}
	
}
