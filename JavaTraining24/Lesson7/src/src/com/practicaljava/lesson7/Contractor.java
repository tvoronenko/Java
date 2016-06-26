package src.com.practicaljava.lesson7;

public class Contractor implements Payable {
	private String name;
	
	public Contractor(String name){
		this.name = name;
	}
	public boolean increasePay(int percent) {
		if(percent < Payable.INCREASE_CAP){
			System.out.println("Increase salary by " + percent + "%. " 
					+ name);
			return true;
		}else{
			System.out.println("Cannot be increased for contractor's rate more than 20% "
		+ name);
			return false;
		}

	}

}
