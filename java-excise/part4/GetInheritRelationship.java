package Reflection;
import java.lang.reflect.Method;
public class GetInheritRelationship {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Class i = Integer.class;
        Class n = i.getSuperclass();
        System.out.println(n);
        Class o = n.getSuperclass();
        System.out.println(o);
        System.out.println(o.getSuperclass());
        
        Class s = Integer.class;
        Class[] is = s.getInterfaces();
        for(Class i1 : is) {
        	System.out.println(i1);
        }
        
        Class s2 = Integer.class.getSuperclass();
        Class[] is2 = s.getInterfaces();
        for(Class i2 : is2) {
        	System.out.println(i2);
        }
        
        Object n2 = Integer.valueOf(123);
        boolean isDouble = n2 instanceof Double;
        System.out.println(isDouble);
        boolean isInteger = n2 instanceof Integer;
        System.out.println(isInteger);
        boolean isNumber = n2 instanceof Number;
        System.out.println(isNumber);
        boolean isSerializable = n2 instanceof java.io.Serializable;
        System.out.println(isSerializable);
        
        
        System.out.println("Integer to Integer: " + Integer.class.isAssignableFrom(Integer.class));
        System.out.println("Integer to Number: " + Number.class.isAssignableFrom(Integer.class));
        System.out.println("Integer to Object: " + Object.class.isAssignableFrom(Integer.class));
        System.out.println("Number to Integer: " + Integer.class.isAssignableFrom(Number.class));
        
	}

}
