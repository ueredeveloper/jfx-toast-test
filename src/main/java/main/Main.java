package main;

import enums.ToastType;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		
	

		primaryStage.setTitle("Hello World!");
		Button btnSuccess = new Button();
		Button btnWarning = new Button();
		Button btnInfo = new Button();
		Button btnError = new Button();
	
		btnSuccess.setText("Success");
		btnSuccess.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				
				Node source = (Node) event.getSource();
			    Stage ownerStage = (Stage) source.getScene().getWindow();
			
			    String toastMsg = "This is a success alert!";
			    
			    
			    
			    Toast.makeText(ownerStage, toastMsg, ToastType.SUCCESS);

				
			}
		});
		
		
		btnWarning.setText("Warning");
		btnWarning.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				
				Node source = (Node) event.getSource();
			    Stage ownerStage = (Stage) source.getScene().getWindow();
			
			    String toastMsg = "This is a warning alert!";
			    
			    
			    
			    Toast.makeText(ownerStage, toastMsg, ToastType.WARNING);

				
			}
		});
		
	
		btnInfo.setText("Info");
		btnInfo.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				
				Node source = (Node) event.getSource();
			    Stage ownerStage = (Stage) source.getScene().getWindow();
			
			    String toastMsg = "This is an info alert!";
			    
			    
			    
			    Toast.makeText(ownerStage, toastMsg, ToastType.INFO);

				
			}
		});
		
		
		
		btnError.setText("Error");
		btnError.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				
				Node source = (Node) event.getSource();
			    Stage ownerStage = (Stage) source.getScene().getWindow();
			
			    String toastMsg = "This is a error alert!";
			    
			    
			    
			    Toast.makeText(ownerStage, toastMsg, ToastType.ERROR);

				
			}
		});
		
		
		HBox hb = new HBox()
;
		hb.getChildren().addAll(btnSuccess, btnWarning, btnInfo, btnError);
		StackPane root = new StackPane(hb);
		root.getChildren();
		primaryStage.setScene(new Scene(root, 800, 600));

		primaryStage.show();

	}
	

}
