public class Car {

	private String color;
	private int HorsePower;
	private int EngineSize;
	private static int count;
	


public Car(){
	
	
	
	
}

public Car(String color, int HorsePower, int EngineSize){
	
	this.color = color;
	this.HorsePower = HorsePower;
	this.EngineSize = EngineSize;
	this.count++;
	
	
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getHorsePower() {
	return HorsePower;
}

public void setHorsePower(int horsePower) {
	HorsePower = horsePower;
}

public int getEngineSize() {
	return EngineSize;
}

public void setEngineSize(int engineSize) {
	EngineSize = engineSize;
}

public String toString(){
	
	return "Color: " + this.color + " HorsePower: " + this.HorsePower + " EngineSize " + this.EngineSize;
	
	
	
}

public static int getCount(){
	
	return count;
	
	
	

}
public boolean equals(Car a){
	
	return (this.color == a.color)&&(this.EngineSize == a.EngineSize)&&(this.HorsePower == a.HorsePower); 
	
	 	
	
}


}