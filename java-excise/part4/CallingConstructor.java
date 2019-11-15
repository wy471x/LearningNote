package Reflection;
import java.lang.reflect.Constructor;
public class CallingConstructor {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        Constructor cons1 = Integer.class.getConstructor(int.class);
        Integer n1 = (Integer)cons1.newInstance(123);
        System.out.println(n1);
        
        Constructor cons2 = Integer.class.getConstructor(String.class);
        Integer n2 = (Integer) cons2.newInstance("456");
        System.out.println(n2);
	}

}
