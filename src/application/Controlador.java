package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Controlador {

	// private ImageView refugees;

	// private Ellipse ceiling;

	public void abrirImagen() {

		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("Superheader.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Stage sendStage = new Stage(); // Nuevo escenario
			sendStage.setTitle("Superheader");
			Scene scene = new Scene(page);
			
			sendStage.setX(520);
			sendStage.setY(250);
			
			sendStage.setScene(scene);

			sendStage.show();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	private void handleSend() {
		abrirImagen();

	}
	

}
