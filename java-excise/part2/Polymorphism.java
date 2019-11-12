package OOP;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PersonSix p = new StudentTwo();
        p.run();
        
        
        Income[] incomes = new Income[] {
        		 new Income(3000),
        		 new Salary(7500),
        		 new StateCouncilSpecialAllowance(15000)
        	}; 
        System.out.println(totalTax(incomes));
	
	    Income[] incomes1 = new Income[] {
	    		new Income(3000),
	    		new Salary(6500),
	    		new DraftFee(5000)
	    };
	    System.out.println(totalTax(incomes1));
 	
	}
	public static double totalTax(Income... incomes) {
		double total = 0;
		for(Income income : incomes) {
			total = total + income.getTax();
		}
		return total;
	}

}

class PersonSix{
	public void run() {
		System.out.println("Person.run");
	}
}

class StudentTwo extends PersonSix{
	public void run() {
		System.out.println("Student.run");
	}
}

class Income{
	protected double income;
	public double getTax() {
		return income * 0.1;
	}
	public Income(double income) {
		this.income = income;
	}
}

class Salary extends Income{
	public Salary(double income) {
		super(income);
	}
	@Override 
	public double getTax() {
		if(income <= 5000) {
			return 0;
		}
		return (income - 5000) * 0.2;
	}
}


class DraftFee extends Income{
	 public DraftFee(double income) {
		 super(income);
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

class StateCouncilSpecialAllowance extends Income{
	public StateCouncilSpecialAllowance(double income){
		super(income);
	}
	@Override
	public double getTax() {
		return 0;
	}
}

