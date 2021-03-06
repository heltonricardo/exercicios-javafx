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
	
	private void alteraContador(Label label, Operacao operacao) {
		
		if (operacao == Operacao.DECREMENTO)
			label.setText(Integer.toString(--contador));
		else
			label.setText(Integer.toString(++contador));
		
		label.getStyleClass().remove("azul");
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelha");
		
		if (contador < 0)
			label.getStyleClass().add("vermelha");
		else if (contador > 0)
			label.getStyleClass().add("verde");
		else
			label.getStyleClass().add("azul");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label titulo = new Label("Contador");
		titulo.getStyleClass().add("titulo");
		
		Label lbContador = new Label("0");
		lbContador.getStyleClass().add("numero");
		lbContador.getStyleClass().add("azul");
				
		Button decremento = new Button("-");
		decremento.getStyleClass().add("botoes");
		decremento.setOnAction(e ->
				alteraContador(lbContador, Operacao.DECREMENTO));
		
		Button incremento = new Button("+");
		incremento.getStyleClass().add("botoes");
		incremento.setOnAction(e ->
				alteraContador(lbContador, Operacao.INCREMENTO));
		
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
