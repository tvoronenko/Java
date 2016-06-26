package com.practicaljava.lesson6;

public class Contractor extends Person implements Payable {

	public Contractor(String name) {
		super(name);
	}

	public boolean increasePay(int percent) {
		if(percent < Payable.INCREASE_CAP){
			System.out.println("Increase salary by " + percent + "%. " 
					+ getName());
		}else{
			System.out.println("Cannot be increased for contractor's rate more than 20% "
		+ getName());
		}

		return true;
	}

}
