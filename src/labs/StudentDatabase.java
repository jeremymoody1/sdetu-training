package labs;

public class StudentDatabase {
	
	String name = "Jeremy";
	String SSN = "123456789";
	//Constructor
	public StudentDatabase(String name, String SSN){
	}

	public static void main(String[] args) {
		
		Student stud1 = new Student("Jeremy Keyes", "123456789");
		
		stud1.checkBalance();
		stud1.pay(1000);
		stud1.enroll("900101", "002");
		stud1.enroll("600302", "012");
		stud1.pay(2000);
		stud1.showCourses();
		stud1.setCity("BR");
		stud1.setPhoneNum("1234561234");
		stud1.setState("LA");
		
		
		
		
	}

}

class Student {
	String  name;
	String  SSN;
	String emailID;
	private String ID;
	private static String schoolID = "42069";
	String courseList = "";
	double balance = 5000;
	private String phoneNum;
	private String city;
	private String state;
	

	
	public Student(String name, String SSN){
		this.name = name;
		this.SSN = SSN;
		setEmailID();
		setID();
	}
	
	
	void setEmailID() {
		this.emailID = name.replace(" ", "") + "@testSchool.edu";
		System.out.println(emailID + " is emailID");
	}
	
	void setID() {
		this.ID = schoolID + "-" + (int) (Math.ceil(Math.random() * 10000)) +  SSN.substring(5, 9);
		System.out.println(ID + " is ID");
	}
	
	void enroll(String courseNum, String sectionNum) {
		String courseSectionNum = courseNum + "-" + sectionNum;
		courseList = courseList + courseSectionNum + "\n";
	}
	
	void showCourses() {
		System.out.println(courseList);
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	void pay(double amount) {
		this.balance = this.balance - amount;
		System.out.println("Amount paid:" + amount);
		checkBalance();
	}
	
	void checkBalance() {
		System.out.println(this.balance);
	}
	
	public void setPhoneNum(String Num) {
		this.phoneNum = Num;
		System.out.println(this.phoneNum);
	}
	
	public void setCity(String city) {
		this.city = city;
		System.out.println(this.city);
	}
	
	public void setState(String state) {
		this.state = state;
		System.out.println(this.state);
	}
}

