package OOP;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuilder sb = new StringBuilder(1024);
        for(int i = 0;i < 1000;i++) {
        	sb.append(",");
        	sb.append(i);
        }
        String s = sb.toString();
	    System.out.println(s);
	    
	    StringBuilder sb1 = new StringBuilder();
	    sb1.append("Mr ")
	    .append("Bob")
	    .append("!")
	    .insert(0,"Hello, ");
	    System.out.println(sb1.toString());
	    
	    Adder adder = new Adder();
	    adder.add(3)
	         .add(5)
	         .inc()
	         .add(10);
	    System.out.println(adder.value());
	    
	    //excise 
	    String[] fields = {"name","position","salary"};
	    String table = "employee";
	    String insert = buildInsertSql(table,fields);
	    System.out.println(insert);
	   
	}
	static String buildInsertSql(String table,String[] fields){
		StringBuilder resultString = new StringBuilder();
		resultString.append("INSERT INTO ")
		            .append(table + " ")
		            .append("("+fields[0]+",")
		            .append(fields[1]+",")
		            .append(fields[2]+") ")
		            .append("VALUES (")
		            .append("?,?,?)");
		return resultString.toString();
	}

}

class Adder{
	private int sum = 0;
	
	public Adder add(int n) {
		sum += n;
		return this;
	}
	
	public Adder inc() {
		sum++;
		return this;
	}
	
	public int value() {
		return sum;
	}
}