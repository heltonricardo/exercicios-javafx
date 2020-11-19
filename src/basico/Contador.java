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
		titulo.getStyleClass().add("titulo");
		
		Label lbContador = new Label("0");
		lbContador.getStyleClass().add("numero");
				
		Button decremento = new Button("-");
		decremento.setOnAction(e -> lbContador
				.setText(Integer.toString(--contador)));
		
		Button incremento = new Button("+");
		incremento.setOnAction(e -> lbContador
				.setText(Integer.toString(++contador)));
		
		HBox boxBotoes = new HBox();
		boxBotoes.setSpacing(10);
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.getChildren().add(decremento);
		boxBotoes.getChildren().add(incremento);
		
		VBox boxPrincipal = new VBox();
		boxPrincipal.setSpacing(10);
		boxPrincipal.setAlignment(Pos.CENTER);
		boxPrincipal.getStyleClass().add("conteudo");
		boxPrincipal.getChildren().add(titulo);
		boxPrincipal.getChildren().add(lbContador);
		boxPrincipal.getChildren().add(boxBotoes);
		
		String caminhoDoCss = getClass()
				.getResource("/basico/Contador.css").toExternalForm();
		
		Scene cena = new Scene(boxPrincipal, 400, 400);
		cena.getStylesheets()
				.add("https://fonts.googleapis.com/css2?family=Oswald");
		cena.getStylesheets().add(caminhoDoCss);
		
		primaryStage.setScene(cena);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
