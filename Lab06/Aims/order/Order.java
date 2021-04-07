package hust.soict.hedspi.aims.order;

import java.util.ArrayList;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	public static final int MAX_LIMITED_ORDERS = 5;
	private static int nbOrders = 0;
	private int id;
	
	private MyDate dateOrdered;
	
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public Order() {
		setId(getId() + 1);
		dateOrdered = new MyDate();
		if (nbOrders < MAX_LIMITED_ORDERS) {
			System.out.println("The order is created");
			nbOrders++;
		} else {
			System.out.println("Can't make order");
		}
		
	}
	
	// method
	public void printOrder(Order order) {
		System.out.println("***********************Order***********************");
		System.out.println("Date: " + order.getDateOrdered());
		System.out.println("Ordered items:");
		for (int i = 0; i < itemsOrdered.size(); i++) {
			System.out.println(
					(i + 1) + ".DVD - "
					+ itemsOrdered.get(i).getTitle() 
					+ " - "
					+  itemsOrdered.get(i).getCategory()
					+ " - "
					+ ((DigitalVideoDisc) itemsOrdered.get(i)).getDirector() 
					+ " - " 
					+ ((DigitalVideoDisc) itemsOrdered.get(i)).getLength() 
					+ ": " 
					+ itemsOrdered.get(i).getCost() 
					+ "$");
		}
		System.out.println("Total cost: " + order.totalCost());
	}
	
	public void addMedia(Media media) {
		if (itemsOrdered.size() >= MAX_NUMBER_ORDERED) {
			System.out.println("The order is already full. Can't be added");
			return;
		} else {
			itemsOrdered.add(media);
			System.out.println("The " + media.getTitle() + " is added");
			return;
		}
	}
	
	public void removeMedia(int removeId) {
		if (itemsOrdered.size() < 1) {
			System.out.println("The order is empty. Nothing to remove");
			return;
		} else if (removeId < 0 && removeId > itemsOrdered.size()) {
			System.out.println("The id is invalid");
			return;
		} else {
			itemsOrdered.remove(removeId);
			System.out.println("The " + itemsOrdered.get(removeId).getTitle() + " is successfully removed");
			return;
		}
	}
	
	public float totalCost() {
		float totalCost = 0;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			totalCost += itemsOrdered.get(i).getCost();
		}
		return totalCost;
	}

	private Media getALuckyItem() {
		double randomDouble = Math.random() * itemsOrdered.size() + 1;
		int randomInt = (int)randomDouble;
		
		return itemsOrdered.get(randomInt - 1);
	}
	
	public String getDateOrdered() {
		int day = dateOrdered.getDay();
		int month = dateOrdered.getMonth();
		int year = dateOrdered.getYear();
		return day + "/" + month + "/" + year;
	}

	public void setDateOrdered(MyDate dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	public static int getMaxNumberOrdered() {
		return MAX_NUMBER_ORDERED;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
