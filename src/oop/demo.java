package oop;


class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}


public class demo {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "joe@test.com";
		person1.phone = "012-345-6789";
		
		person1.walk();
		person1.eat();
		person1.sleep();
		System.out.println(person1.phone);
	}

}
