package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	
	private List<String> authors = new ArrayList<String>();

	
	// constructor
	public Book(String title) {
		super(title);
	}
	public Book(String title, String category) {
		super(title, category);
	}
	
	public Book(String title, String category, List<String> authors) {
		super(title, category);
		this.authors = authors;
	}
	
	
	// method
	private void addAuthor(String authorName) {
		for (int i = 0; i < authors.size(); i++) {
			if (authors.get(i).equals(authorName)) {
				System.out.println("The author's name has already in the list.");
				break;
			} else {
				authors.add(authorName);
				System.out.println("The author is added");
				break;
			}
		}
	}
	
	private void removeAuthor(String authorName) {
		if (authors.size() < 1) {
			System.out.println("Nothing to remove");
		} else {
			for (int i = 0; i < authors.size(); i++) {
				if (authors.get(i).equals(authorName)) {
					authors.remove(i);
					System.out.println("The " + authorName + " is removed");
					break;
				}
			}
		}
	}

	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

}
