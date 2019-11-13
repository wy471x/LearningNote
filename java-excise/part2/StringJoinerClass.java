package OOP;
import java.util.StringJoiner;
public class StringJoinerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] names = {"Bob","Alice","Grace"};
       StringBuilder sb = new StringBuilder();
       sb.append("Hello ");
       for(String name : names) {
    	   sb.append(name).append(", ");
       }
       
       sb.delete(sb.length() - 2, sb.length());
       sb.append("!");
       System.out.println(sb.toString());
       
       
       StringJoiner sj = new StringJoiner(", ","Hello ","!");
       for(String name : names) {
    	   sj.add(name);
       }
       System.out.println(sj.toString());
       
       String s = String.join(", ", names);
       System.out.println(s);
       
       //excise
       String[] fields = {"name","position","salary"};
       String table = "employee";
       String select = buildSelectSql(table,fields);
       System.out.println(select);
       System.out.println("SELECT name, position, salary FROM employee".equals(select));
	}
	static String buildSelectSql(String table,String[] fields) {
		StringJoiner sj = new StringJoiner(", ","SELECT "," FROM " + table);
		for(String field : fields) {
			sj.add(field);
		}
		return sj.toString();
		
	}

}
