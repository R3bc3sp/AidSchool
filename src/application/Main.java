package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	
		private AnchorPane rootLayout;
		
		public Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
		
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("SchoolOfAid.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		//primaryStage.sizeToScene(); Redimensiona correctamente la ventana
		
		primaryStage.setMinWidth(700);
		primaryStage.setMinHeight(550);
		
		
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
		
		
	}
	
		
		
			
			
		}

