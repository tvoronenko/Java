package test;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class findUnique {

	public static void main(String[] args) {
		Set<String> result = findUniqueSorted(args);
		System.out.println(result);
		result = findUniqueReversed(args);
		System.out.println(result);
		result = findUniqueSortedLength(args);
		System.out.println(result);
		
	}

	public static Set<String> findUniqueSorted(String[] args)
	{
		Set<String> result = new TreeSet<String>();
		for(String line: args)
		{
			result.add(line);
		}
		return result;
		
	}
	
	
	public static Set<String> findUniqueReversed(String[] args)
	{
		Set<String> result = new TreeSet<String>(new MyComparatorReverse());
		for(String line: args)
		{
			result.add(line);
		}
		return result;
		
	}
	
	public static Set<String> findUniqueSortedLength(String[] args)
	{
		Set<String> result = new TreeSet<String>(new MyComparatorLength());
		for(String line: args)
		{
			System.out.println(line);
			result.add(line);
			System.out.println(result.size());
		}
		return result;
		
	}
	
	static class MyComparatorReverse implements Comparator<String>
	{

		@Override
		public int compare(String o1, String o2) {
			//check for null
			return o2.compareTo(o1);
		}
		
	}
	
	static class MyComparatorLength implements Comparator<String>
	{

		@Override
		public int compare(String o1, String o2) {
			System.out.println(">> o1 " + o1 + "   o2: " + o2);
			if (o1.length() > o2.length())
			return 1;
			else if (o1.length() == o2.length())
				return 0;
			else
			return -1;
		}
		
	}
	
	
}
//user contains f l age, implement comparable interf., sort by f , if  