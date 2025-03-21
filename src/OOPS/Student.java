package OOPS;

public class Student {
// id name college name and marks
	int ID = 1;
	String name = "Anuska";
	String college = "IEM";
	double marks = 90.89;
	public void study() {
		System.out.println(name +" is studying ");
	}
	
	// Parameterized Constructor (All Fields)
    public Student(int ID, String name, String college, double marks) {
        this.ID = ID;
        this.name = name;
        this.college = college;
        this.marks = marks;
    }
    //constructor chaining
	 public Student(int ID, String name, String college) {
	        this(ID,name);
	        this.college = college;
	        
	    }
	 public Student(int ID, String name ) {
	        this.ID = ID;
	        this.name = name;
	        System.out.println("2 arg constructor");
	    }
	//constructor
	
	  public Student() { 
		  System.out.println("No-arg constructor"); 
		  }
	 public Student(int ID) {
		 this.ID = ID;
		 System.out.println("1 arg constructor");
	 }
	//parameterize constructor
	//public Student(int x, String )
	/*
	 * public void reading() { System.out.println(name + " is reading."); }
	 */
}
