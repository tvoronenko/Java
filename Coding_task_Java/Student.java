package test;

public class Student implements Comparable {
	 private String firstName;
	    private String lastName;
	    private int age;
		@Override
		public int compareTo(Object arg0) {
			Student student = (Student)arg0;
			int result = this.lastName.compareTo(student.getFname());
	        if (result == 0)
	        {
	            result = this.firstName.compareTo(student.getFname());
	        }
	        if (result == 0){
	        	result = (this.age < student.age ) ? -1: (this.age > student.age ) ? 1:0 ;
	        }
	        return result;
		}
		
		public Student(String firstName, String lastName, int age)
	    {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age= age;
	    }
		
		public String getFname(){
			return this.firstName;
		}
		
		public String getLname(){
			return this.lastName;
		}
		
		public int getAge(){
			return this.age;
		}
	 
	    
}
