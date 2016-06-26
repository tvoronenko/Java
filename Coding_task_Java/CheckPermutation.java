package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CheckPermutation {

	public static void main(String[] args) {
		CheckPermutation prog = new CheckPermutation();
		String str1 = "dog      ";
		String str2 = "  godd   ";
		System.out.println(prog.isPermutation(str1,str2));
		System.out.println(Character.getNumericValue('a'));
		System.out.println(Character.getNumericValue('t'));

	}
	
	public boolean isPermutation(String str1, String str2){
		if (str1 == null || str2 == null || str1.length()!=str2.length())
			return false;
//	Set<Character> strToset1 = new TreeSet<Character>();
		
//		for(int i = 0; i < str1.length(); i++){
//			strToset1.add(str1.charAt(i));
//			 
//		}
	
		List <Character> strToset1 = str1.chars().mapToObj(e->(char)e).collect(Collectors.toList());
		strToset1.sort(null);
		List<Character> strToset2 = new ArrayList<Character>();
		for(int i = 0; i < str2.length(); i++){
			strToset2.add(str2.charAt(i));
			 
		}
		strToset2.sort(null);
		if (strToset2.equals(strToset1))
			return true;
		return false;
	}

}
