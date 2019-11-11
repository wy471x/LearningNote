package OOP;

public class ContructFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PersonThree p = new PersonThree();
        System.out.println(p.getAge() + "," + p.getName());
	}

}

class PersonThree{
	 private String name;
	 private int age;
	 
	 public PersonThree(String name,int age) {
		 this.name = name;
		 this.age = age;
	 }
	 
	 public PersonThree(String name) {
		 this(name,18);
	 }
	 
	 public PersonThree() {
		 this("Unnamed");
	 }
	 
	 public int getAge() {
		 return this.age;
	 }
	 
	 public String getName() {
		 return this.name;
	 }
}