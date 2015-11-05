import javax.swing.JOptionPane;
import java.util.Scanner;

public class CE {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a byte value");
		
		byte num1 = input.nextByte();
		
		System.out.println("Enter a short value");
		
		short num2 = input.nextShort();
		
		System.out.println("Enter a int value");
		
		int num3 = input.nextInt();
		
		System.out.println("Enter a long value");
		
		long num4 = input.nextLong();
		
		System.out.println("Enter a double value");
		
		double num5 = input.nextDouble();
		
		System.out.println("Enter a char value");
		
		char num6 = input.next(".").charAt(0);
		
		System.out.println("Enter a boolean value");
		
		boolean num7 = input.nextBoolean();
		
		
		JOptionPane.showMessageDialog(null, "The byte is \""+ num1 + "\""
											+"\n" + "The short is \"" + num2 + "\""
											+"\n" + "The int is \"" + num3 + "\""
											+"\n" + "The long is \"" + num4 + "\""
											+"\n" + "The double is \"" + num5 + "\""
											+"\n" + "The char is \"" + num6 + "\""
											+"\n" + "The boolean is \"" + num7 + "\"");
											
		
		
	}
	

}
