package OOP;

public class EnumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Weekday day = Weekday.SUN;
        if(day.dayValue == 6 || day.dayValue == 0) {
        	System.out.println("Today is " + day +". Work at home!");
        }else {
        	System.out.println("Today is " + day + ". Work at office!");
        }
        String s = Weekday.SUN.name();
        System.out.println(s);
        
        int n = Weekday.SUN.ordinal();
        System.out.println(n);
        
        
        switch(day) {
        case MON:
        case TUE:
        case WED:
        case THU:
        case FRI:
        	System.out.println("Today is " + day + ". Work at office!");
            break;
        case SAT:
        case SUN:
        	System.out.println("Today is "+ day + ". Work at home!");
        	break;
        default :
        		throw new RuntimeException("cannot process " + day);
        }
	}

}

enum Weekday{
	SUN(0,"������"),MON(1,"����һ"),TUE(2,"���ڶ�"),WED(3,"������"),THU(4,"������"),FRI(5,"������"),SAT(6,"������");
    private final String chinese;
    public final int dayValue;
    
    private Weekday(int dayValue,String chinese) {
    	this.dayValue = dayValue;
    	this.chinese = chinese;
    }
    
    @Override 
    public String toString() {
    	return this.chinese;
    }
}


enum Color{
	RED,BLUE,GREEN;
}