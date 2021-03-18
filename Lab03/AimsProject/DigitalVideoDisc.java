package src;

public class DigitalVideoDisc {
	String title;
	private String category;
	private String director;
	private int length;
	float cost;
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	public void getInformation() {
		System.out.println("The DVD's information");
		System.out.println("Title: " + title);
		System.out.println("Category: " + category);
		System.out.println("Director: " + director);
		System.out.println("Length: " + length);
		System.out.println("Cost: " + cost);
	}
}
