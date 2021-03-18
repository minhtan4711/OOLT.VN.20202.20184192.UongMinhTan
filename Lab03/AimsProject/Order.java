package AimsProject;

import java.util.ArrayList;

public class Order {
	private int qtyOrdered;
	
	public static int MAX_NUMBERS_ORDERED = 10;
	
	private ArrayList<DigitalVideoDisc> itemOrdered = new ArrayList<DigitalVideoDisc>();
	
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (itemOrdered.size() >= MAX_NUMBERS_ORDERED) {
			System.out.println("The order is almost full");
		} else {
			itemOrdered.add(disc);
			System.out.println("The disc has been added");
			qtyOrdered = qtyOrdered + 1;
		}
		 
		
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		itemOrdered.remove(disc); 
	}
	
	public float totalCost() {
		float totalCost = 0;
		for (int i = 0; i < itemOrdered.size(); i++) {
			totalCost += itemOrdered.get(i).cost;
		}
		return totalCost;
	}
	
	
}
