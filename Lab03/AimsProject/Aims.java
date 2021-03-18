package AimsProject;

public class Aims {

	public static void main(String[] args) {

		Order anOrder = new Order();
		
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "John Musker", 90, 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		assert anOrder.getQtyOrdered() >= 1  : "The order has no item";
		anOrder.removeDigitalVideoDisc(dvd3);
		
		
		
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
		
		
	}

}
