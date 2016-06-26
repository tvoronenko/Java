 class TestTax {
	 public static void main(String[] args){
		 
		 Tax t = new Tax(); //create an instance
		 
		 //assigning the value to class members
		 t.grossIncome = 50000;
		 t.dependents = 2;
		 t.state = "NJ";
		 
		 double yourTax = t.calTax(); //calculating tax
		 
		 //Printing the result
		 System.out.println("Your tax is "+yourTax);
		 
		 Tax t1 = new NJTax(); //create an instance
		 
		 //assigning the value to class members
		 t1.grossIncome = 50000;
		 t1.dependents = 2;
		 t1.state = "NJ";
		 
		 double yourTax1 = t1.calTax(); //calculating tax
		 
		 //Printing the result
		 System.out.println("Your tax is "+yourTax1);
		 
	 }
}
