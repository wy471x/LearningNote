package Collection;

import java.util.*;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> list = new ArrayList<>(Arrays.asList("A","B","C"));
        System.out.println(list.contains("C"));
        System.out.println(list.contains(new String("C")));
        System.out.println(list.contains("X"));
        System.out.println(list.indexOf("C"));
        System.out.println(list.indexOf(new String("C")));
        System.out.println(list.indexOf("X"));
	
        List<Person> list2 = new ArrayList<>(Arrays.asList(new Person("Xiao Ming",20),
        		  										new Person("Xiao Hong",19),
        		  										new Person("Bob",18)));
        System.out.println(list2.indexOf(new Person("Bob",18)));
        System.out.println(list2.contains(new Person("Bob",18)));
	
	}

}

class Person {
	public String name;
	public int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	// Override equals method
	public boolean equals(Object o) {
		if(o instanceof Person) {
			Person p = (Person) o;
			boolean nameEquals = false;
			if(this.name == null && p.name == null) {
				nameEquals = true;
			}
			if(this.name != null) {
				nameEquals = this.name.equals(p.name);
			}
			return this.name.equals(p.name) && this.age == p.age;
		}
		return false;
//		if(o instanceof Person) {
//			Person p = (Person) o;
//			return Objects.equals(this.name,p.name) && this.age == p.age;
//		}
//		return false;
	}
}
