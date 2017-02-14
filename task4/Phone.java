package task4;

public class Phone {
	private int number;
	private String network;

	public Phone(int number, String network) {
		super();
		this.number = number;
		this.network = network;
	}

	public Phone() {
		super();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public void registerInNetwork(Phone phone, Network network) {
		this.network = network.getName();
	}

	public void call(Phone p1, Phone p2) {
		if (p1.getNetwork().equalsIgnoreCase(p2.getNetwork()) == true) {
			System.out.println("You are calling to " + p2.getNumber() + " please wait");
		} else {
			System.out.println("You are calling wrong number. Please, check your number");
		}
	}

	@Override
	public String toString() {
		return "Phone [number=" + number + ", network=" + network + "]";
	}

}
