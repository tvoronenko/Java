package test;

public class Balancer {
	public static void main(String[] args) {
		Balancer balancer = new Balancer();
		int[] numbers = { 5, 4, 0, 19, 3, 4, 2, 0};
		int[] numbersWithDuplicates = {5, 4, 2, 1 };
		System.out.println(balancer.balancedPoint1(numbers));
		System.out.println(balancer.balancedPoint1(numbersWithDuplicates));

	}
	
	public  int balancedPoint(int[] mass){
		
		for(int i = 1; i< mass.length-1; i++){
			int balancePoint = i;
			int sumLeft = 0;
			int sumRight = 0;
			for (int j = 0; j< mass.length; j++){
			if(j<balancePoint){
				sumLeft+=mass[j];
			}
			else if (j>balancePoint){
				sumRight+=mass[j];
			}
			}
			if(sumRight==sumLeft){
				return balancePoint;
			}
		}
		return -1;
		
	}
	
 public  int balancedPoint1(int[] mass){
	 if (mass == null){
		 throw new IllegalArgumentException();
	 }
	 int sumAll = 0;
	 for(int i = 0; i< mass.length; i++){
		 sumAll = sumAll+mass[i];
	 }
	 int sumLeft = 0;
	 for(int i = 1; i< mass.length-1; i++){
		 sumLeft = sumLeft + mass[i-1];
		 if (sumLeft == (sumAll - sumLeft - mass[i] )){
			 return i;
		 }
	 }
	 
	 return -1;
	 
 }
 
 public static int balancedPoint2(int[] mass){
	 if (mass == null){
		 throw new IllegalArgumentException();
	 }
	 
	 
	 return -1;
 }
}
