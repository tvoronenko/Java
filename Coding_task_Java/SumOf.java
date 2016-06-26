package test;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class SumOf {
	public static void main(String[] args) {
		int[] numbers = { 9, 7, 3, 5, 4, 8, 2 };
		int[] numbersWithDuplicates = { 2, 4, 8, 5, 6, -2, 4, 7, 5, 9 };
		System.out.println(">>>>>>>>>");
		sumOf2(numbers, 7);
		System.out.println(">>>>>>>>>");
		sumOf2(numbersWithDuplicates, 7);
		
		

	}
//check null mass, check integer summ
	public static void sumOf(int[] mass, int sum) {
		if (mass==null){
			throw new IllegalArgumentException();
		}	
	Arrays.sort(mass);
			for (int i = 0; i < mass.length; i++) {
				int a = mass[i];
				int index = Arrays.binarySearch(mass, (sum-a));
				//System.out.println("index = "+index);
				if (index >=0){
					System.out.println(a+ "+" + mass[index]+"= "+ sum);
				}
			}

	}


	
	public static void sumOf1(int[] mass, int sum) {
		if(mass.length < 2){
            return;
        } 
		Map<Integer,Integer> result= new HashMap<>();
		Set set = new HashSet(mass.length);
		for(int value : mass){
			int target = sum - value; 
			// if target number is not in set then add 
			if(!set.contains(target)){
				set.add(value); 
			}
			else { 
				result.put(value,target);
				}
			}
		if(result.size()==0){
			return;
		}else{
			System.out.println(result);
		}
		}
	public static void sumOf2(int[] mass, int sum) {
		if(mass.length < 2){
            return;
        } 
		Arrays.sort(mass);
		Map<Integer,Integer> result= new HashMap<>();
		int left = 0;
		int right = mass.length-1;
		while(left < right){
			int internalSum = mass[left] + mass[right];
			if (internalSum == sum){
				result.put(mass[left],mass[right]);
				left = left + 1;
				right = right - 1;
			}else if(internalSum < sum){
				left = left + 1;
			}else if(internalSum > sum){
				right = right - 1;
			}
		}
		
		if(result.size()==0){
			return;
		}else{
			System.out.println(result);
		}
	}
}
