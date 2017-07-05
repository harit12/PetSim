import java.util.*;
public class Animal {
	static Scanner keyboard = new Scanner(System.in);
	static public int food = 1000;
	static public int happiness = 50;
	public int id;
	public String name;
	public int age = 0;
	static String petPlace;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = (int) Math.random();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("What would you like to name you pet");
		name = keyboard.nextLine();
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this. age = age;
	}
	public static void main(String args[]) {
		String[] animalType = {"Fish", "Hamster", "Dog",  "Cat"};
		System.out.println("Welcome to virtual pet simulator");
		System.out.println("What animal would you like");
		System.out.println("fish, hamster, dog, or cat" );
		String animalChoice = keyboard.nextLine().toLowerCase();
		if(animalChoice.equals(animalType[0])) {
			System.out.println("You got a fish");
		}
		else if(animalChoice.equals(animalType[1])) {
			System.out.println("You got a hamster");
		}
		else if(animalChoice.equals(animalType[2])) {
			System.out.println("You got a dog");
		}
		else if(animalChoice.equals(animalType[3])) {
			System.out.println("You got a cat");
		}
		
	}

}
