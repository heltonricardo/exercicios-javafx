package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application{
	
	private Stage janela;
	private Scene passo1;
	private Scene passo2;
	private Scene passo3;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		janela = primaryStage;
		
		criarPasso1();
		criarPasso2();
		criarPasso3();

		janela.setScene(passo1);
		janela.setTitle("Wizard");
		janela.show();
	}
	
	private void criarPasso1() {
		Label label = new Label("Passo 1");
		
		Button proximo = new Button("Próximo >");
		proximo.setOnAction(e -> janela.setScene(passo2));
		
		HBox hbox = new HBox();
		hbox.setSpacing(50);
		hbox.setAlignment(Pos.BOTTOM_RIGHT);
		hbox.getChildren().add(label);
		hbox.getChildren().add(proximo);
		
		passo1 = new Scene(hbox, 400, 400);
	}
	
	private void criarPasso2() {
		Label label = new Label("Passo 2");
		
		Button anterior = new Button("< Anterior");
		anterior.setOnAction(e -> janela.setScene(passo1));
		Button proximo = new Button("Próximo >");
		proximo.setOnAction(e -> janela.setScene(passo3));
		
		HBox hbox = new HBox();
		hbox.setSpacing(50);
		hbox.setAlignment(Pos.BOTTOM_RIGHT);
		hbox.getChildren().add(label);
		hbox.getChildren().add(anterior);
		hbox.getChildren().add(proximo);
		
		passo2 = new Scene(hbox, 400, 400);
	}
	
	private void criarPasso3() {
		Label label = new Label("Passo 3");
		
		Button anterior = new Button("< Anterior");
		anterior.setOnAction(e -> janela.setScene(passo2));
		Button finalizar = new Button("Finalizar");
		finalizar.setOnAction(e -> System.exit(0));
		
		HBox hbox = new HBox();
		hbox.setSpacing(50);
		hbox.setAlignment(Pos.BOTTOM_RIGHT);
		hbox.getChildren().add(label);
		hbox.getChildren().add(anterior);
		hbox.getChildren().add(finalizar);
		
		passo3 = new Scene(hbox, 400, 400);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
