package Generic;

import java.util.Arrays;

public class UseGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person[] ps = new Person[] {
        		new Person("Bob",61),
        		new Person("Curry",88),
        		new Person("Curry",80),
        		new Person("Lily",75),
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
	}

}

class Person implements Comparable<Person>{
	String name;
	Integer score;
	
	Person(String name,Integer score){
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		return  this.name + "," + this.score;
	}
	
	public int compareTo(Person other) {
		if(this.name.compareTo(other.name) == 0) {
			return this.score.compareTo(other.score);
		}
		return this.name.compareTo(other.name);
	}
	
}
