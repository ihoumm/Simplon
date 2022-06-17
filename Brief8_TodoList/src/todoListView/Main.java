package todoListView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	
	@Override
	public void start(Stage loginStage) throws Exception {
		
		Parent root = FXMLLoader.load(Main.class.getResource("MainLogin.fxml"));
		
		Scene scene = new Scene(root, 968, 438);
		
		
		loginStage.setScene(scene);
		loginStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
