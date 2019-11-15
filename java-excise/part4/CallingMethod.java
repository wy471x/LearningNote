package Reflection;
import java.lang.reflect.Method;
public class CallingMethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Class stdClass = StudentTwo.class;
        System.out.println(stdClass.getMethod("getScore", String.class));
        System.out.println(stdClass.getMethod("getName"));
        System.out.println(stdClass.getDeclaredMethod("getGrade",int.class));
        
        String s = "Hello world";
        Method m = String.class.getMethod("substring", int.class);
        
        String r = (String) m.invoke(s,0);
        System.out.println(r);
        
        Method m2 = String.class.getMethod("substring",int.class,int.class);
        String r2 = (String) m2.invoke(s, 0,11);
        System.out.println(r2);
        
        Method m3 = Integer.class.getMethod("parseInt", String.class);
        Integer n = (Integer) m3.invoke(null, "12345");
        System.out.println(n);
        
        PersonThree pt = new PersonThree();
        Method m4 = pt.getClass().getDeclaredMethod("setName", String.class);
        m4.setAccessible(true);
        m4.invoke(pt, "Bob");
        System.out.println(pt.name);
        
        Method h = PersonThree.class.getMethod("hello");
        h.invoke(new StudentTwo());
	}

}

class PersonThree{
	String name;
	public String getName() {
		return "Person";
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public void hello() {
		System.out.println("Person:hello");
	}
}

class StudentTwo extends PersonThree{
	public int getScore(String type) {
		return 99;
	}
	
	public int getGrade(int year) {
		return 1;
	}
	
	public void hello() {
		System.out.println("Student:hello");
	}
}