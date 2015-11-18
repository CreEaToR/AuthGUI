
public class Student {
	private String name;
	private double gpa;
	private final int SIZE = 4;
	private double [] assignments;
	
	
	public Student(){
		name = "";
		
		assignments = new double[SIZE];
		
			
		
		gpa = 0;
		
		
	}
	
	public Student(String name, double [] assignments){
		super();
		this.name = name;
		this.assignments = assignments;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return calculateAVGGpa();
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public double[] getAssignments() {
		return assignments;
	}

	public void setAssignments(double[] assignments) {
		this.assignments = assignments;
	}

	public int getSIZE() {
		return SIZE;
	}
	
	
	private double calculateAVGGpa(){
	
		double sum=0;
		if(this.assignments != null){
		for(int i=0; i<assignments.length; i++ ){
			
			sum += assignments[i];
		}
		this.gpa = sum/assignments.length;
			}
		
		
		
		return this.gpa;
	}
	public String toString(){
		String info="";
		info = "Student Name: " + this.name;
		for(int i=0; i<assignments.length; i++ ){
			info+="\n Assignment " + (i+1) + " \t " + assignments[i] + " \n ";
			
			
		}
				info += "GPA: " + getGpa();
				return info;
		
		
	}
}

