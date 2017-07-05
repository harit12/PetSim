import java.util.*;
public class Animal {
	static Scanner keyboard = new Scanner(System.in);
	static public int food = 1000;
	static public int happiness = 50;
	public String gender;
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
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this. age = age;
	}
	public static int getFood() {
		return food;
	}
	public static void setFood(int food) {
		Animal.food = food;
	}
	public static int getHappiness() {
		return happiness;
	}
	public static void setHappiness(int happiness) {
		Animal.happiness = happiness;
	}
	public  void setGender(String gender) {
		System.out.println("Which gender?");
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}
	public static void main(String args[]) {
		Animal virtAnimal = new Animal();
		String[] animalType = {"fish", "hamster", "dog",  "cat"};
		System.out.println("Welcome to virtual pet simulator");
		System.out.println("What animal would you like");
		System.out.println("fish, Hamster, Dog, or Cat" );
		String animalChoice = keyboard.nextLine().toLowerCase();
		if(animalChoice.equals(animalType[0])) {
			System.out.println("You got a fish");
		}
		else if(animalChoice.equals(animalType[1])) {
			System.out.println("You got a hamster");
			
		}
		else if(animalChoice.equals(animalType[2])) {
			Dog virtDog = new Dog();
			System.out.println("You got a dog");
			System.out.println("Customize your dog(You can't change later)");
			System.out.println("What would you like to name it");
			String nameChoice = keyboard.nextLine();
			virtDog.setName(nameChoice);
			System.out.println("Which gender?");
			String genderChoice = keyboard.nextLine().toLowerCase();
			virtDog.setGender(genderChoice);
		}
		else if(animalChoice.equals(animalType[3])) {
			System.out.println("You got a cat");
		}
		
	}


}
