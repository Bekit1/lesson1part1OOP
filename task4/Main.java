package task4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Network n1 = new Network();
		n1.setName("Life");
		n1.setAmount(2);
		n1.createNetwork();

		Phone p1 = new Phone();
		p1.setNumber(343);
		p1.registerInNetwork( n1);
		System.out.println(p1.getNetwork().toString());
	
		
		System.out.println();

		Phone p2 = new Phone();
		p2.setNumber(345);
		p2.registerInNetwork( n1);
		System.out.println(p1.getNetwork().toString());
		n1.checkNumber(343);
		p1.call(347);
	}
}