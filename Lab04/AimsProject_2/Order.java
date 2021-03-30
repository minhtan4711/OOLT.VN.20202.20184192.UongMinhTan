package AimsProject_2;

public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	public static final int MAX_LIMITED_ORDERS = 5;
	private static int nbOrders = 0;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private static int qtyOrdered;
	private MyDate dateOrdered;
	
//	public Order() {
//		dateOrdered = new MyDate();
//		if (nbOrders < MAX_LIMITED_ORDERS) {
//			System.out.println("The order is created");
//			nbOrders++;
//		} else {
//			System.out.println("Can't make order");
//		}
//		
//	}
	
	// method
	public void printOrder(Order order) {
		System.out.println("***********************Order***********************");
		System.out.println("Date: " + order.getDateOrdered());
		System.out.println("Ordered items:");
		for (int i = 0; i < Order.getQtyOrdered(); i++) {
			System.out.println((i + 1) + ".DVD - " + itemsOrdered[i].getTitle() + " - " +  itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
		}
		System.out.println("Total cost: " + order.totalCost());
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBER_ORDERED) {
			itemsOrdered[qtyOrdered++] = disc;
			System.out.println("The disc has been added");
		} else {
			System.out.println("The order is almost full");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc ...disc) {
		if (disc != null) {
			if (disc.length > 0 && qtyOrdered < MAX_NUMBER_ORDERED) {
				for (int i = 0; i < disc.length; i++) {
					itemsOrdered[qtyOrdered++] = disc[i];
				}
				System.out.println("All the discs has been added");
			} 
		} else {
			System.out.println("The order is almost full");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		if(Order.getQtyOrdered() >= MAX_NUMBER_ORDERED) {
			System.out.println("The discs can't be added");
		} else {
			addDigitalVideoDisc(disc1);
			if (Order.getQtyOrdered() < MAX_NUMBER_ORDERED) {
				addDigitalVideoDisc(disc2);
			} else {
				System.out.println("The disc " + disc2.getTitle() + " could not be added");
			}
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
//		System.arraycopy(disc, MAX_NUMBER_ORDERED, disc, qtyOrdered, MAX_NUMBER_ORDERED);
		int flag = -1;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc)) {
				for (int j = i; j < qtyOrdered - 1; j++) {
					flag = 1;
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
				System.out.println("Remove successfully");
				qtyOrdered--;
			}
		}
		if (flag == -1) {
			System.out.println("The disc not found");
		}
	}
	
	public float totalCost() {
		float totalCost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			totalCost += itemsOrdered[i].getCost();
		}
		return totalCost;
	}

	
	
	// getter and setter
	public static int getQtyOrdered() {
		return qtyOrdered;
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

	public DigitalVideoDisc[] getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(DigitalVideoDisc[] itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}

	public static int getMaxNumberOrdered() {
		return MAX_NUMBER_ORDERED;
	}

	public static void setQtyOrdered(int qtyOrdered) {
		Order.qtyOrdered = qtyOrdered;
	}
}
