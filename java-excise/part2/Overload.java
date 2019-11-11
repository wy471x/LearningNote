package OOP;

public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PersonFour ming = new PersonFour();
        PersonFour hong = new PersonFour();
        ming.setName("Xiao Ming");
        hong.setName("Xiao","Hong");
        System.out.println(ming.getName());
        System.out.println(hong.getName());
	}

}

class PersonFour{
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setName(String firstname,String lastname) {
		this.name = firstname + " " + lastname;
	}
}