
public class TestTax {
	public static void main(String[] args){
		if (args.length != 3 ){
			System.out.println("Sample usage of the program:" +
		"java TestTax 50000 NJ 2");
			System.exit(0);
		}
		 double grossIncome = Double.parseDouble(args[0]); //local variable
		 String state = args[1];
		 int dependents = Integer.parseInt(args[2]);
		 
		 Tax t = new Tax(); //create an instance
		 t.grossIncome = grossIncome;
		 t.dependents = dependents;
		 t.state = state;
		 double yourTax = t.calTax(); //calculating tax
		 
		 //Printing the result
		 System.out.println("Your tax is "+yourTax);
		 
	}
	
	
}
