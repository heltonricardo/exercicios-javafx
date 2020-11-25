package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

/*
 * O GridPane permite criar uma grade flexível onde é possível inserir um
 * elemento em uma posição exata. Para adicionar os elementos, segue a ordem:
 * Coluna, Linha, Quantidade de colunas para ocupar, Quantidade de linhas para
 * ocupar (as quantidade devem ser maiores que zero). Se for ocupar somente uma
 * linha e uma coluna, utilize somente as posições, como feito em c4 e c6.
 */

public class TesteGridPane extends GridPane {

	public TesteGridPane() {
		
		setGridLinesVisible(true);
		setHgap(10);
		setVgap(10);
		
		getColumnConstraints().addAll(cc(), cc(), fcc(), cc(), cc());
		getRowConstraints().addAll(rc(), rc(), frc(), rc(), rc());
		
		Caixa c1 = new Caixa().comTexto("1");
		add(c1, 0, 0, 2, 2);
		
		Caixa c2 = new Caixa().comTexto("2");
		add(c2, 1, 1, 2, 2);
		
		Caixa c3 = new Caixa().comTexto("3");
		add(c3, 4, 2, 1, 3);
		
		Caixa c4 = new Caixa().comTexto("4");
		add(c4, 3, 1);
		
		Caixa c5 = new Caixa().comTexto("5");
		add(c5, 0, 4, 2, 1);
		
		Caixa c6 = new Caixa().comTexto("6");
		add(c6, 3, 3);
	}
	
	private ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setPercentWidth(20);
		cc.setFillWidth(true);
		return cc;
	}
	
	private ColumnConstraints fcc() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setMinWidth(50);
		cc.setMaxWidth(50);
		cc.setFillWidth(true);
		return cc;
	}
	
	private RowConstraints rc() {
		RowConstraints rc = new RowConstraints();
		rc.setPercentHeight(20);
		rc.setFillHeight(true);
		return rc;
	}
	
	private RowConstraints frc() {
		RowConstraints rc = new RowConstraints();
		rc.setMinHeight(50);
		rc.setMaxHeight(50);
		rc.setFillHeight(true);
		return rc;
	}
}
