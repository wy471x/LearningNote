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
	SUN(0,"星期日"),MON(1,"星期一"),TUE(2,"星期二"),WED(3,"星期三"),THU(4,"星期四"),FRI(5,"星期五"),SAT(6,"星期六");
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