package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HasUniqueChars {

	public static void main(String[] args) {
		HasUniqueChars prog = new HasUniqueChars();
		String str="zaqwsxcderfvbgtyhnmjuik";
		System.out.println(prog.hasUniqueChars128AdditData(str));
		System.out.println(prog.hasUniqueChars128(str));
		System.out.println(prog.hasUniqueCharsON(str));
	}

	public boolean hasUniqueChars128AdditData(String str) {
		
		if(str==null || str.length() > 128){
			return false;
		}
		
		Set<Character> uniqStr = new HashSet<Character>();
		
		for(int i = 0; i < str.length(); i++){
			if(!uniqStr.add(str.charAt(i))){
				return false;
			}
			 
		}
		
		return true;
		
	}
	
	public boolean hasUniqueChars128(String str) {
		if(str.length() > 128)
			return false;
		
		
		for(int i = 0; i < str.length(); i++){
			for( int j = i+1;j < str.length(); j++ ){
				if(str.charAt(j)==str.charAt(i))
					return false;
			}
		}
		return true;
	}
	
	public boolean hasUniqueCharsON(String str) {
		if(str==null)
			return false;//error
		
		
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(str.indexOf(c)!=str.lastIndexOf(c)){
				return false;
			}
			
		}
		return true;
	}
	
}
