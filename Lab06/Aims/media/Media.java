package hust.soict.globalict.aims.media;

public class Media {
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
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
