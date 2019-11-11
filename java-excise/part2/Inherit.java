package OOP;

public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student ming = new Student("Xiao Ming",18,99);
        ming.print();
        PersonFive p = new PersonFive();
        System.out.println(p instanceof PersonFive);
        System.out.println(p instanceof Student);
        
        Student s = new Student();
        System.out.println(s instanceof PersonFive);
        System.out.println(s instanceof Student);
        
        Student n = null;
        System.out.println(n instanceof Student);
        
        PrimaryStudent ps = new PrimaryStudent("xiongda",20,100);
        ps.printItem();
	}

}

class PersonFive{
	protected String name;
	protected int age;
	
	public PersonFive(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public PersonFive() {
		
	}
} 

class Student extends PersonFive{
	protected int score;
	
	public Student(String name,int age,int score) {
		super(name,age);
		this.score = score;
	}
	
	public Student(String name,int age) {
		super(name,age);
	}
	
	public Student() {}
	
	public void print() {
		System.out.println(super.name + " ," + super.age + " " + score );
	}
}

class PrimaryStudent extends Student{
	protected int grade;
	public PrimaryStudent(String name,int age,int grade) {
		super(name,age);
		this.grade = grade;
	}
	
	public void printItem() {
		System.out.println(super.name + " " + super.age + " " + grade);
	}
}