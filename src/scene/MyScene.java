package scene;

import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyScene extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hello");
		VBox vb = new VBox();
		Button btn = new Button("Hello my son");
		vb.getChildren().add(btn);
		Button vtn = new Button("Andrei");
		vb.getChildren().add(vtn);
		Scene scene = new Scene(vb);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}