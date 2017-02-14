package task1;

public class Cat {
	private String name;
	private String breed;
	private int age;
	private double weight;

	public Cat(String name, String breed, int age, double weight) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.weight = weight;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void goToilet(double lose) {
		weight = weight - lose;

	}

	public void sizzle() {
		System.out.println("Shhhhhh");
	}

	public void eatFood(double food) {
		weight = weight + food;
	}

	public void eatAnotherCat(Cat c1, Cat c2) {
		c1.weight = c1.weight + c2.weight;
		c2.weight = 0;
		System.out.println(c1.getName() + " have eaten " + c2.getName() + ":cc");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", breed=" + breed + ", age=" + age + ", weight=" + weight + "]";
	}

}
