package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {
	
	private int contador = 0;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label titulo = new Label("Contador");
		Label btContador = new Label("0");
				
		Button decremento = new Button("-");
		decremento.setOnAction(e -> btContador
				.setText(Integer.toString(--contador)));
		
		Button incremento = new Button("+");
		incremento.setOnAction(e -> btContador
				.setText(Integer.toString(++contador)));
		
		HBox boxBotoes = new HBox();
		boxBotoes.setSpacing(10);
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.getChildren().add(decremento);
		boxBotoes.getChildren().add(incremento);
		
		VBox boxPrincipal = new VBox();
		boxPrincipal.setSpacing(10);
		boxPrincipal.setAlignment(Pos.CENTER);
		boxPrincipal.getChildren().add(titulo);
		boxPrincipal.getChildren().add(btContador);
		boxPrincipal.getChildren().add(boxBotoes);
		
		Scene cena = new Scene(boxPrincipal, 400, 400);
		
		primaryStage.setScene(cena);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
