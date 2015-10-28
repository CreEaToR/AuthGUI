/**Jose Mendoza
 * Class use to create people
 * 
 * 
 * 
 * 
 */
public class Person {

	private String name;
	private int age;
	private double height;
	
/**
 * Create default constructor 
 * 
 */
public Person(){
		
		
	
	}
	
/**
 * Constructor that accepts arguments
 * 	
 */	
public Person(String name,int age,double height){
	
	this.name = name;
	this.age = age;
	this.height = height;
			
	
	
}

/**
 * returns name */
public String getName(){
	
	return name;
	
}
/**
 * returns age
 */public int getAge(){
	
	return age;
	
}
/**
 * returns height
 */public double getHeight(){
	
	return height;
	
}

/**
 * sets name
 */public void setName(String name){
	
	this.name = name;
	
	
}
/**
 * 
 * sets age
 */public void setAge(int age){
	
	this.age = age;
	
}

/**
 * sets height
 * 
 */public void setHeight(double height){
	
	this.height = height;
	
}
/**
 * Returns the person's information
 */

public String toString(){
	
return "Name " + this.name + "\n" +
		"Age " + this.age + "\n" +
		"Height " + this.height + "\n";
	
	
}







}