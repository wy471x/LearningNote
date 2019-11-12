package OOP;

public class StaticFiledAndStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PersonNine.number = 100;
		PersonNine ming = new PersonNine("Xiao Ming",12);
        PersonNine hong = new PersonNine("Xiao Hong",15);
        
        ming.name = "Xiao Zhang";
        System.out.println(ming.name);
        System.out.println(hong.number);
        
        
        System.out.println(ming.number);
        
        //excise
        
        PersonNine xiong = new PersonNine("Xiao Xiong",12);
        PersonNine le = new PersonNine("Le Le",13);
        le.getCount();
        System.out.println(PersonNine.getCount());
	}

}

class PersonNine{
    String name;
	public int age;
	private static int count = 0;
	
	public static int number;
	
	public PersonNine(String name,int age) {
		this.name = name;
		this.age = age;
		count++;
	}
	
	public static void setNumber(int value) {
		number = value;
	}	
	
	public static int getCount() {
		  return count;
	}
}
 

interface PersonTen{
	public static final int MALE = 1;    // <==> int MALE = 1;
	public static final int FEMALE = 2;  // <==> int FEMALE = 2;
	
}