package OOP;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person ming = new Person();
        ming.setName("Xiao Ming");
        ming.setAge(15);
        System.out.println(ming.getName() + ", " + ming.getAge());
	    Group g = new Group();
	    g.setNames("Xiao Ming","Xiao Hong","Xiao Jun");
	    g.setNames("Xiao Ming","Xiao Hong");
	    g.setNames("Xiao Ming");
	    g.setNames();
	}

}

class Person{
	private String name;
	private int age;
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if(age < 0 || age > 130) {
			throw new IllegalArgumentException("invalid age value");
		}
		this.age = age;
	}
		
}

class Group{
	private String[] names;
    public void setNames(String... names) {
    	this.names = names;
    }
}
