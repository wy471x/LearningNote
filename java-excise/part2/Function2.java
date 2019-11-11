package OOP;

public class Function2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person1 p = new Person1();
        String[] fullname = new String[] {"Homer","Simpson"};
        p.setName(fullname);
        System.out.println(p.getName());
        //input is "Homer Simpson"
        fullname[0] = "Bart";
        System.out.println(p.getName());
        //input is "Bart Simpson"
        
 	}

}

class Person1{
	private String[] name;
	
	public String getName() {
		return this.name[0] + " " + this.name[1];
	}
	
	public void setName(String[] name) {
		this.name = name;
	}
}