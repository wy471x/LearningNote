
public class CommandArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(String arg : args) {
           if("-version".equals(arg))
        	System.out.println("v 1.0");
            break;
        }
        	
	}

}
