import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

import java.util.Collections;

import javax.swing.JOptionPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;


public class ScoreGUI extends Application{


	   public static void main(String args[]) throws Exception{
	   
	  
	   
	   launch(args);
	   
	 
	   }
	   
	   public void start(Stage primaryStage) throws Exception{
		   
		
		   primaryStage.setTitle("Calculate");
		   Label NameLbl = new Label("Name");
		   Label Assignment1Lbl = new Label("Assignment 1");
		   Label Assignment2Lbl = new Label("Assignment 2");
		   Label Assignment3Lbl = new Label("Assignment 3");
		   Label Assignment4Lbl = new Label("Assignment 4");
		
		   final TextField NameTxtFld = new TextField();
		   final TextField Assignment1TxtFld = new TextField();
		   final TextField Assignment2TxtFld = new TextField();
		   final TextField Assignment3TxtFld = new TextField();
		   final TextField Assignment4TxtFld = new TextField();
		  
		   
		   
		   
		   Button submitBtn = new Button("Calculate");
		   submitBtn.setOnAction(new EventHandler<ActionEvent>(){
			   
			   
		
			 
			   
			   
			   public void handle(ActionEvent arg0){
				   String name = "";
				   name = NameTxtFld.getText();
				   
			
				  double a1 = Double.parseDouble(Assignment1TxtFld.getText());
				  double a2 = Double.parseDouble(Assignment2TxtFld.getText());
				  double a3 = Double.parseDouble(Assignment3TxtFld.getText());
				  double a4 = Double.parseDouble(Assignment4TxtFld.getText());
				  double [] anum = {a1,a2,a3,a4};
				 
				
			   
				   Student student = new Student(name,anum);
				   
				   System.out.println(student.getGpa());
			   
				   double weight = student.getGpa()/(100);
				   
			   JOptionPane.showMessageDialog(null,student + "\n Weighted: " + weight);
			   
			   
			   
			   		}
			   
			   });
		   GridPane root = new GridPane();
		   root.setAlignment(Pos.CENTER);
		   root.setVgap(10);
		   root.setHgap(10);
		   
		   root.add(NameLbl,0,0);
		   root.add(Assignment1Lbl,0,1);
		   root.add(Assignment2Lbl,0,2);
		   root.add(Assignment3Lbl,0,3);
		   root.add(Assignment4Lbl,0,4);
		   
		 

		   root.add(NameTxtFld,1,0);
		   root.add(Assignment1TxtFld,1,1);
		   root.add(Assignment2TxtFld,1,2);
		   root.add(Assignment3TxtFld,1,3);
		   root.add(Assignment4TxtFld,1,4);
		   
		 
		   
		   
		   root.add(submitBtn,1,5);
		   
		   Scene scene = new Scene(root,700,700);
		  
		   primaryStage.setScene(scene);
		   
		   primaryStage.show();
		   
		   }
	   }
	 

