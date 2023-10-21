package formulario;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Formulario extends Application {
    @Override
    public void start(Stage stage) throws IOException {
    	Parent root = FXMLLoader.load(this.getClass().getResource("/fxml/form.fxml"));
    	Scene scene = new Scene( root);
    	
        stage.setTitle("Formulario");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
		launch(args);
	}
}
