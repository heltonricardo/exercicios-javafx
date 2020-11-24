package layout;

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
	}
}
