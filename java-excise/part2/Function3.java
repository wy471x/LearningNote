package OOP;

public class Function3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Person2 p = new Person2();
//        String bob = "Bob";
//        p.setName(bob);
//        System.out.println(p.getName());
//        bob = "Alice";
//        System.out.println(p.getName());
        //"Bob"
//        System.out.println(p.getName());
        //"Bob"
        //two input are "Bob",because String is  immutable. 
		PersonTwo ming = new PersonTwo();
		ming.setName("ะกร๗");
		ming.setAge(12);
		System.out.println(ming.getName() +" ," + ming.getAge());
		
	}

}

class PersonTwo{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}