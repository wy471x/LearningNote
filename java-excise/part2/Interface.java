package OOP;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SalaryThree s = new SalaryThree(6000);
        DraftFeeThree d = new DraftFeeThree(5000);
        System.out.println(totalTax(s,d));
	}
    public static double totalTax(SalaryThree s,DraftFeeThree d) {
    	return s.getTax() + d.getTax();
    }
}

interface Hello{
	  public void sayHello();	
	}

interface PersonEight extends Hello{        //abstract classs PersonEight{
	void run();                             //     public abstract void run();
	String getName();                       //     public abstract String getName();
}                                           //} 



class StudentFour implements PersonEight,Hello{
	private String name;
	
	public StudentFour(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(this.name + " run");
	}
	
	@Override 
	public String getName() {
		return this.name;
	}
	
	@Override 
	public void sayHello() {
		System.out.println("Hello");
	}
}



interface IncomeThree{
	public double getTax();
}

class SalaryThree implements IncomeThree{
	private double income;
	
	public SalaryThree(double income) {
		this.income = income;
	}
	
	@Override 
	public double getTax() {
		return (income - 5000) * 0.2;
	}
}


class DraftFeeThree implements IncomeThree{
	private double income;
	public DraftFeeThree(double income) {
		this.income = income;
	} 
	
	@Override 
	public double getTax() {
		if(income < 4000) {
			return (income - 800) * 0.7 * 0.2;
		}else {
			return income * (1 - 0.2) * 0.7 * 0.2;
		}
		
	}
}