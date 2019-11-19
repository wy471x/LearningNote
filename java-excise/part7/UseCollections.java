package Collection;
import java.util.*;
public class UseCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> mutable = new ArrayList<>();
        mutable.add("apple");
        mutable.add("pear");
        
        List<String> immutable = Collections.unmodifiableList(mutable);
       
        //mutable = null;
        System.out.println(immutable);
	}

}
