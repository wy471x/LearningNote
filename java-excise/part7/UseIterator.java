package Collection;
import java.util.*;
public class UseIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> list = new ArrayList<>(Arrays.asList("apple","banana","pear"));
        for(String s : list) {
        	System.out.println(s);
        }
        System.out.print("-----------------------------------\n");
        for(Iterator<String> it = list.iterator(); it.hasNext();) {
        	String s = it.next();
        	System.out.println(s);
        }
        
        System.out.print("-----------------------------------\n");
        ReverseList<String> rlist = new ReverseList<>();
        rlist.add("Apple");
        rlist.add("Orange");
        rlist.add("Pear");
        for(String s : rlist) {
        	System.out.println(s);
        }
	}

}

class ReverseList<T> implements Iterable<T> {
	private List<T> list = new ArrayList<>();
	
	public void add(T t) {
		list.add(t);
	}
	
	@Override
	public Iterator<T> iterator(){
		return new ReverseIterator(list.size());
	}
	
	class ReverseIterator implements Iterator<T>{
		int index;
		ReverseIterator(int index){
			this.index = index;
		}
		@Override 
		public boolean hasNext() {
			return index > 0;
		}
		@Override
		public T next() {
			index--;
			return ReverseList.this.list.get(index);
		}
		
	}
}
