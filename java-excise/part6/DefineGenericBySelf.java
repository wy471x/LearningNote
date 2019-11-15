package Generic;

public class DefineGenericBySelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Pair<String> ps = new Pair("wan","yong");
        
        System.out.println(ps.getFirst() + " " +ps.getLast());
       
	}

}


class Pair<T>{
	private T first;
	private T last;
	public Pair(T first,T last) {
		this.first = first;
		this.last = last;
	}
	public T getFirst() {
		return first;
	}
	
	public T getLast() {
		return last;
	}
	
	public static <K> Pair<K> create(K first,K last){
		return new Pair<K>(first,last);
	}
}