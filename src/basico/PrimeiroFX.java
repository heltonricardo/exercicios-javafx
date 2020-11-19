package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button botaoA = new Button("A");
		botaoA.setOnAction(e -> System.out.println("A"));
		Button botaoB = new Button("B");
		botaoB.setOnAction(e -> System.out.println("B"));
		Button botaoC = new Button("C");
		botaoC.setOnAction(e -> System.exit(0));
		
		HBox box = new HBox();
		box.setSpacing(10);
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
		
		Scene cena = new Scene(box, 200, 150);
		
		primaryStage.setScene(cena);
		primaryStage.show();
	}

	public static void main(String[] args) {
		
		launch(args);
	}
}
