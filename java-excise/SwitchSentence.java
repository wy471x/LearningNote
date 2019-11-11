
public class SwitchSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String fruit = "apple";
        switch(fruit) {
        case "apple":
        	System.out.println("Selected apple");
            break;
        case "pear":
        	System.out.println("Selected pear");
        case "mango":
        	System.out.println("Selected mango");
        default :
        	System.out.println("No fruit selected");
            break;
        }
        switch(fruit) {
        case "apple" :
        	System.out.println("Selected apple");
            break;
        case "pear":
        	System.out.println("Selected pear");
        case "mango":
        	System.out.println("Selected mango");
        default :
        	System.out.println("No fruit selected");
            break;
        }
        
	}

}
