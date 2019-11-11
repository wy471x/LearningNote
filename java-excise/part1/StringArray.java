
public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] names = {"ABC","XYZ","ZOO"};
        String s = names[1];
        names[1] = "cat";
        //System.out.println(s);
        for(int i = 0; i < names.length;++i) {
        	System.out.println(names[i]);
        }
	}

}
