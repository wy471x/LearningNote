package Reflection;

import java.lang.reflect.Field;

public class VisitField {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Class stdClass = Student.class;
        System.out.println(stdClass.getField("score"));
        System.out.println(stdClass.getField("name"));
        System.out.println(stdClass.getDeclaredField("grade"));
        
        Object p = new PersonTwo("Xiao Ming",20);
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
        Object value = f.get(p);
        System.out.println(value);
        
        PersonTwo pt = new PersonTwo("Xiao Ming",20);
        System.out.println(pt.getName());
        System.out.println(pt.getAge());
        Class c2 = p.getClass();
        Field f2 = c2.getDeclaredField("name");
        f2.setAccessible(true);
        f2.set(pt, "Xiao Hong");
        Field f3 = c2.getDeclaredField("age");
        f3.setAccessible(true);
        f3.set(pt,23);
        System.out.println(pt.getAge());
	}

}

class Student extends Person{
	public int score;
	private int grade;
}

class Person{
	public String name;
}

class PersonTwo{
	private String name;
	private int age;
	
	public PersonTwo(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}