package Reflection;

public class ClassClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        printClassInfo("".getClass());
        
	}

	static void printClassInfo(Class cls) {
		System.out.println("Class name :" + cls.getName());
		System.out.println("Simple name :" + cls.getSimpleName());
		if(cls.getPackage() != null) {
			System.out.println("Package name: " + cls.getPackage().getName());
			
		}
		System.out.println("is interface: " + cls.isInterface());
		System.out.println("is enum: " + cls.isEnum());
		System.out.println("is array: " + cls.isArray());
		System.out.println("is primitive: " + cls.isPrimitive());
	}

}
