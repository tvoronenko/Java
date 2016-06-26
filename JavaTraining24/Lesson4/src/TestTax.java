
public class TestTax {
	public static void main(String[] args){
		 double grossIncome; //local variable
		 String state;
		 int dependents;
		 
		 grossIncome = 50000;
		 state = "NJ";
		 dependents = 2;
		 
		 Tax t = new Tax(grossIncome, state, dependents); //create an instance
		 
		 double yourTax = t.calTax(); //calculating tax
		 
		 //Printing the result
		 System.out.println("Your tax is "+yourTax);
		 
		 Tax t2 = new Tax(65000, "TX", 4);
		 double hisTax = t2.calTax(); //calculating tax
		 
		 //Printing the result
		 System.out.println("Your tax is "+hisTax);
		 Tax.convertToEuros(yourTax);
		 Tax.convertToEuros(hisTax);
	}
	
	
}
