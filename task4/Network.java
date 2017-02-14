package task4;

import java.util.Arrays;

public class Network {
	private int[] numbers;
	private int amount;
	private String name;

	public Network(int[] numbers) {
		super();
		this.numbers = numbers;
	}

	public Network(int amount, String name) {
		super();
		this.amount = amount;
		this.name = name;
	}

	public Network() {
		super();
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addToLibrary(Phone phone, Network network) {
		amount++;
		int[] a = Arrays.copyOf(numbers, amount+ 1);
		network.setNumbers(a);
		numbers[amount] = phone.getNumber();
	}

	public void createNetwork(Network network) {
		int[] a = new int[amount];
		network.setNumbers(a);
	}

	@Override
	public String toString() {
		return "Network [numbers=" + Arrays.toString(numbers) + "]";
	}

}
