package Generic;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TypeErasure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Class<IntPair> clazz = IntPair.class;
        Type t = clazz.getGenericSuperclass();
        if(t instanceof ParameterizedType) {
        	ParameterizedType pt = (ParameterizedType) t;
        	Type[] types = pt.getActualTypeArguments();
        	Type firstType = types[0];
        	Type secondType = types[1];
        	Class<?> typeClass1 = (Class<?>) firstType;
        	System.out.println(typeClass1);
        }
	}

}

class Pair2<T>{
	private T first;
	private T last;
	public Pair2(T first,T last) {
		this.first = first;
		this.last = last;
	}
	
	public T getFirst() {
		return first;
	}
	
	public T getLast() {
		return last;
	}
	
	
}

class IntPair extends Pair2<Integer>{
	public IntPair(Integer first,Integer last) {
		super(first,last);
	}
}