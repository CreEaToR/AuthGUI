
import javax.swing.JOptionPane;


public class Drive {

	public static void main(String args[]){
	
	int i = 0;
	
	Car cars[] = new Car[2];
	
	while(0<2){
	
	
	
	String color = (String)JOptionPane.showInputDialog("Enter car's color");
	
	
	String horsepower = (String)JOptionPane.showInputDialog("Enter car's horsepower");
	
	int numberh = Integer.parseInt(horsepower);
	
	String enginesize = (String)JOptionPane.showInputDialog("Enter car's engine size");
	
	int numbere = Integer.parseInt(enginesize);
	
	
	cars[i] = new Car(color,numberh,numbere);
	
	System.out.println("Car number: " + cars[i].getCount());
	
	
	
	
	Car test1 = new Car(cars[i].getColor(),cars[i].getHorsePower(),cars[i].getEngineSize());
	Car test2 = new Car(cars[i].getColor(),cars[i].getHorsePower(),cars[i].getEngineSize());
 
	System.out.println(test1.equals(test2));
	
	i++;
	
	}
	
	
	
	
	}	
	
	}

	
