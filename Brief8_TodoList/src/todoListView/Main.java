package todoListView;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	@Override
	public void start(Stage MainStage) throws Exception {
		
		Parent root = FXMLLoader.load(Main.class.getResource("Main.fxml"));
		
		Scene scene = new Scene(root, 893, 467);
		scene.setFill(Color.TRANSPARENT);
		MainStage.initStyle(StageStyle.TRANSPARENT);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		MainStage.setScene(scene);
		MainStage.show();
		
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
