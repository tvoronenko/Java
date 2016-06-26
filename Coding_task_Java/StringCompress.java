package test;

public class StringCompress {

	public static void main(String[] args) {
		StringCompress prog = new StringCompress();
		String str1 = "azxs";
		System.out.println(prog.compress(str1));
	}
	
	public String compress(String str){
		StringBuilder compresedString = new StringBuilder() ;
		int count = 1;
		for(int i =1; i<str.length();i++){
			if(str.charAt(i-1) == str.charAt(i)){
				count++;
			}else{
				compresedString.append(str.charAt(i-1));
					compresedString.append(count);
//				else
//					index = index +1;
				
				count = 1;
				
			}
		}
		
		return compresedString.length() < str.length()? compresedString.toString() : str ;
	}

}
