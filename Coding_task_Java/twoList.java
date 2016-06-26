package test;

import java.util.Set;
import java.util.TreeSet;

public class twoList {

	public static void main(String[] args) {
		int[] num1 = { 1,2,5,8,9,12 };
		int[] num2 = { 20,15,10,7,6,3,1 };
		
		Set<Integer> merg = merge(num1,num2);
		System.out.println(merg);

	}
	
	public static Set<Integer> merge(int[] num1, int[] num2){
		Set<Integer> result= new TreeSet<Integer>();
		for(int i:num1){
			result.add(i);
		}
		for(int i:num2){
			result.add(i);
		}
//		int[] result = new int[num2.length+num1.length];
//		int index=0;
//		int ind1 =0;
//		int ind2 = num2.length-1;
//		while (ind1<num1.length || ind2>=0){
//			if(num1[ind1]<num2[ind2]){
//				result[index] = num1[ind1];
//			index++;
//			ind1++;
//		}else if(num1[ind1]==num2[ind2]){
//			result[index] = num1[ind1];
//			index++;
//			ind1++;
//			result[index] = num2[ind2];
//			index++;
//			ind2--;
//		}else
//		{
//			result[index] = num2[ind2];
//			index++;
//			ind2--;
//			
//		}
//		}
		return result;
	}

}
