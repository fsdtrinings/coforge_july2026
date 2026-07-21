package inheritance;

abstract public class Animal {
	
	private int age;
	private int weight;
	private int points;
	
	public Animal() {
		super();
	}
	public Animal(int age, int weight) {
		super();
		this.age = age;
		this.weight = weight;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	/* common method for all animals */
	abstract public void doEat();
	
	@Override
	public String toString() {
		return "Animal [age=" + age + ", weight=" + weight + "]";
	}
	
	
	
	
}
