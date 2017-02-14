package task4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Network n1 = new Network();
		n1.setName("Life");
		n1.setAmount(2);
		n1.createNetwork(n1);

		Phone p1 = new Phone();
		p1.setNumber(343);
		p1.registerInNetwork(p1, n1);
		System.out.println(p1.getNetwork());
		n1.addToLibrary(p1, n1);
		System.out.println(n1.toString());
		System.out.println();

		Phone p2 = new Phone();
		p2.setNumber(445);
		p2.registerInNetwork(p2, n1);
		System.out.println(p2.getNetwork());
		n1.addToLibrary(p2, n1);
		System.out.println(n1.toString());
		p1.call(p1, p2);
		System.out.println();

		Phone p3 = new Phone();
		p3.setNumber(166);
		p3.setNetwork("Vodafone");
		System.out.println(p3.getNetwork());
		System.out.println(n1.toString());
		p3.call(p1, p3);
	}
}