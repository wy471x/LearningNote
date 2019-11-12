package OOP;

public class AbtractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PersonSeven p = new StudentThree();
        p.run();
        
        //excise
        IncomeTwo[]  incomes = {
        		new SalaryTwo(7000),
        		new DraftFeeTwo(10000)
        };
        System.out.println(totalTax(incomes));
        
	}
	public static double totalTax(IncomeTwo... incomes) {
		double total = 0;
		for(IncomeTwo income : incomes) {
			total = total + income.getTax();
		}
		return total;
	}

}


abstract class PersonSeven{
	public abstract void run();
} 

class StudentThree extends PersonSeven{
	@Override 
	public void run() {
		System.out.println("Student.run");
	}
}

//excise
abstract class IncomeTwo{
	protected double income;
	public abstract double getTax();
	
	public IncomeTwo(double income) {
		this.income = income;
	}
	
	public IncomeTwo() {
		
	}
	
}


class SalaryTwo extends IncomeTwo{
    public SalaryTwo(double income) {
    	super(income);
    }  
	@Override
	  public double getTax() {
    	  return (income - 5000) * 0.2; 
      }
}

class DraftFeeTwo extends IncomeTwo{
	public DraftFeeTwo(double income) {
		super(income);
	}
	@Override
	public double getTax() {
		if(income < 4000 ) {
			return (income - 800) * 0.7 * 0.2; 
		}else {
			return income * (1 - 0.2) * 0.7 * 0.2;
		}
	}
}

