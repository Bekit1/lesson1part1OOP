package task4;

public class Phone {
	private int number;
	private Network network;

	public Phone(int number, Network network) {
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

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}

	public void registerInNetwork(Network network) {
		this.network = network;
		network.addToLibrary(this);

	}

	public void call(int number) {
		int exist = 0;
		for (int i = 0; i < network.getNumbers().length; i++) {

			if (network.getNumbers()[i] == number) {
				exist++;
			}
		}
		if (exist > 0) {
			System.out.println("You are calling to " + number);
		} else {
			System.out.println("Wrong number");
		}

	}

	@Override
	public String toString() {
		return "Phone [number=" + number + ", network=" + network + "]";
	}

}
