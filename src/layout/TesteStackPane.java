package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

/*
 * Adicionando os elementos dessa maneira, o elemento c1 será o "fundo" da
 * pilha, e o c6 será o topo. Nessa pilha (que possui funcionamento semelhante
 * a uma lista) é possível enviar trocar as ordens dos elementos. O elemento do
 * topo é exibido em cima (com prioridade) sobre os demais. Quando usamos
 * get(0).toFront() o elemento do fundo da pilha é retirado e colocado em cima.
 * E quando usamos getChildren().get(5).toBack(), nesse caso, o elemento do
 * topo é retirado de sua posição e vai para o fundo da pilha.
 */

public class TesteStackPane extends StackPane {

	public TesteStackPane() {
		
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		getChildren().addAll(c1, c2, c3, c4, c5, c6);
		
		setOnMouseClicked(e -> {
			if (e.getSceneX() > getScene().getWidth() / 2)
				getChildren().get(0).toFront();
			else
				getChildren().get(5).toBack();
		});
		
		/*
		 * Abaixo segue um código para que seja feita a transição entre as
		 * layers automaticamente, a cada 3 segundos. Crimos uma thread FX
		 * usando Thread + Platform para que o programa funcione. Dentro de um
		 * laço (para que seja infinito o processo) usamos o sleep com 3 mil
		 * mili segundos (3 segundos) para que tenha uma pausa durante as
		 * transições. Devemos colocar o comando de transição dentro de um
		 * Platform.runLater() para que funcione. O Thread.sleep exige que
		 * tratemos a exceção, por isso o try-catch. Depois há o t.setDaemon()
		 * para que a thread finalize quando fechamos a aplicação (importante):
		 */
		
		Thread t = new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(3000);
					Platform.runLater(() -> {
						getChildren().get(0).toFront();
					});
				} catch (Exception e2) {
					break;
				}
			}
		});
		
		t.setDaemon(true);
		t.start();
	}
}
