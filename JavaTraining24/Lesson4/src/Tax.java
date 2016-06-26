 class Tax {
	 double grossIncome; //class member variable
	 String state;
	 int dependents;
	 static int customerCounter;
	 
	 public double calTax(){
		return (grossIncome*0.33 - dependents*100);
	 }
	 
	 //Constructor
	 Tax(double gi, String st, int depen){
		 grossIncome = gi; //member variable initialization
		 state = st;
		 dependents = depen;
		 customerCounter++;
		 
		 System.out.println("Preparing the tax data for customer #" +
		 customerCounter);
	 }
	 
	 public static void convertToEuros(double taxInDollars){
		 System.out.println("Tax in Euros: " + taxInDollars/1.25);
	 }
}
