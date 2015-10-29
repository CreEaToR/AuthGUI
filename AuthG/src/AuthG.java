import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javax.swing.JOptionPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class AuthG extends Application{

public enum AccountType{Administrator, Student, Staff, Guest}

 AccountType[] choices = {AccountType.Administrator, AccountType.Student, AccountType.Staff, AccountType.Guest};


   public static void main(String args[]) throws Exception{
   
   
   
   launch(args);
   
    
 }
 
 @Override
 public void start(Stage primaryStage) throws Exception{

                                                 
 String correctUserName = "Jose";
 String correctPassword = "Password";
 String correctAccount = "Student";
 primaryStage.setTitle("Auth");
 Label userNameLbl = new Label("User Name");
 Label passwordLbl = new Label("Password");
 
 
 TextField userNameTxtFld = new TextField();
 PasswordField pwTxtFld = new PasswordField();

 
 Button submitBtn = new Button("Submit");
 submitBtn.setOnAction(new EventHandler<ActionEvent>(){
 
 String inputUserName = "";
 String inputPW = "";

   public void handle(ActionEvent arg0){
	   int x = 0;
	   
	   
	   
   inputUserName = userNameTxtFld.getText();
   inputPW = pwTxtFld.getText();
   
   do{
   
 
	   if(correctUserName.equals(inputUserName) && correctPassword.equals(inputPW)){
		   
   
   
   AccountType input = (AccountType) JOptionPane.showInputDialog(null,"Select your account type.", "Account Type", 
           
                
           
                                                                           JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);  
    
                                                                
     //For drop down
                                                                           
   switch(input){
	   case Administrator:
		   JOptionPane.showMessageDialog(null, "Fail Account");
		   x++;
		   break;
	   case Student:
		   JOptionPane.showMessageDialog(null, "Welcome student");
		   x++;
		   break;
	   case Staff:
		   JOptionPane.showMessageDialog(null, "Fail Account");
		   x++;
		   break;
	   case Guest:
		   JOptionPane.showMessageDialog(null, "Fail Account");
		   x++;
		   break;
		   default:
			   
   }
  
   
                                                           
    
   
   
    }else{
  
   
   
   JOptionPane.showMessageDialog(null, "Fail Authentication");
  
  
  break;
   
     
    

   
    }
    }while(x<3);
   
   if(x==3)
	   
	   JOptionPane.showMessageDialog(null, "Contact admin");
   }
 
 });
 
 
 
 GridPane root = new GridPane();
 root.setAlignment(Pos.CENTER);
 root.setVgap(10);
 root.setHgap(10);
 
 
 root.add(userNameLbl,0,0);
 root.add(passwordLbl,0,1);

 
 root.add(userNameTxtFld,1,0);
 root.add(pwTxtFld,1,1);

 root.add(submitBtn,1,3);
 
 Scene scene = new Scene(root,500,500);
 
 primaryStage.setScene(scene);
 
 primaryStage.show();
 
 
 }
 
}  
   