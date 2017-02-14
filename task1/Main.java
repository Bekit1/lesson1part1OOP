package task1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1 = new Cat("Snow", "Pierce", 7, 3.4);
		System.out.println(c1.toString());
		c1.sizzle();
		c1.goToilet(1);
		System.out.println(c1.getWeight());
		c1.eatFood(5.1);
		System.out.println(c1.getWeight());

		Cat c2 = new Cat("Loser", "Manul", 2, 2);
		System.out.println(c2.toString());
		c1.eatAnotherCat(c1, c2);
		c2.setName("Dead");
		System.out.println(c2.getName());
		System.out.println(c2.toString());
	}

}
