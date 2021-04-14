package hust.soict.hedspi.aims;

import hust.soict.globalict.aims.media.*;
import hust.soict.hedspi.aims.order.Order;

import java.util.Scanner;

public class Aims {
	
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
	public static void showMenuMedia() {
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Order anOrder = null;
		int check = 0;
		while(true) {
			showMenu();
			int choice = in.nextInt();
			switch(choice) {
			case 1:
				anOrder = new Order();
				System.out.println("Created new order successfully");
				check = 1;
				break;
			case 2:
				if (check == 0) {
					System.out.println("Create new order before add");
				}
				showMenu();
				DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		        dvd1.setCategory("Animation");
		        dvd1.setCost(19.95f);
		        dvd1.setDirector("Roger Allers");
		        dvd1.setLength(87);
		        anOrder.addMedia(dvd1);
		        
		        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		        dvd2.setCategory("Science Fiction");
		        dvd2.setCost(24.95f);
		        dvd2.setDirector("Geogre Lucas");
		        dvd2.setLength(124);
		        anOrder.addMedia(dvd2);
		        
		        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		        dvd3.setCategory("Animation");
		        dvd3.setCost(18.99f);
		        dvd3.setDirector("John Musker");
		        dvd3.setLength(90);
		        anOrder.addMedia(dvd3);
				break;
			case 3:
				if (check == 0) {
					System.out.println("The list is empty. Can't delete");
				}
				Scanner inDelete = new Scanner(System.in);
				int choiceDelte = inDelete.nextInt();
				System.out.println("Choose the item you want to delete by id");
				anOrder.removeMedia(choiceDelte);
				break;
			case 4:
				if (check == 0) {
					System.out.println("The list is empty");
				}
				System.out.println("List of items");
				anOrder.printOrder(anOrder);
				break;
			case 0:
				in.close();
				System.out.println("Exit the program");
				break;
			default:
				System.out.println("Invalid choice!");
				break;
			}
		}
		
		
//		Order anOrder = new Order();
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
//        dvd1.setCategory("Animation");
//        dvd1.setCost(19.95f);
//        dvd1.setDirector("Roger Allers");
//        dvd1.setLength(87);
////        anOrder.addDigitalVideoDisc(dvd1);
//
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
//        dvd2.setCategory("Science Fiction");
//        dvd2.setCost(24.95f);
//        dvd2.setDirector("Geogre Lucas");
//        dvd2.setLength(124);
////        anOrder.addDigitalVideoDisc(dvd2);
//
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
//        dvd3.setCategory("Animation");
//        dvd3.setCost(18.99f);
//        dvd3.setDirector("John Musker");
//        dvd3.setLength(90);
//        anOrder.addMedia(dvd3);
//        
//        anOrder.printOrder(anOrder);
//        
////        assert anOrder.getQtyOrdered() >= 1 : "The order has no item";
////		anOrder.removeDigitalVideoDisc(dvd3);
//		
//		System.out.print("Total cost is: ");
//		System.out.println(anOrder.totalCost());
	}

}
