package Week1;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oder anOrder = new oder();
		//
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		//
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("ALaddin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("Jonh Musker");
		dvd3.setLength(90);
		anOrder.addDigitalVideoDisc(dvd3,dvd2);
		
		anOrder.display();
	}

}
