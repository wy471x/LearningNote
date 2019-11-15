package Generic;

public class ExtendsWildcard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Pair3<Integer> p = new Pair3<>(123,456);
        int n = add(p);
        System.out.println(n);
	}
	
	static int add(Pair3<? extends Number> p) {
		Number first = p.getFirst();
		Number last = p.getLast();
		//p.setFirst(new Integer(first.intValue() + 100));
		//p.setLast(new Integer(last.intValue() + 100));
		return p.getFirst().intValue() + p.getLast().intValue();
	}
}

class Pair3<T>{
	private T first;
	private T last;
	public Pair3(T first,T last) {
		this.first = first;
		this.last = last;
	}
	
	public T getFirst() {
		return first;
	}
	
	public T getLast() {
		return last;
	}
	
	public void setFirst(T first) {
		this.first = first;
	}
	
	public void setLast(T last) {
		this.last = last;
	}
}