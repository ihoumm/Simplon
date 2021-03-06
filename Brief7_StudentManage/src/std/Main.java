package std;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws IOException {
		
		
		Parent root = FXMLLoader.load(Main.class.getResource("MainStdManage.fxml"));
		
		Scene scene = new Scene(root, 1300, 800);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	
	}
}
