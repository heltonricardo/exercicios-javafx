package layout;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class TesteAnchorPane extends AnchorPane {

	private static Double pixels = 100.0;
	
	public TesteAnchorPane() {
		Quadrado q1 = new Quadrado();
		setTopAnchor(q1, pixels);
		setLeftAnchor(q1, pixels);
		
		Quadrado q2 = new Quadrado();
		setTopAnchor(q2, pixels);
		setRightAnchor(q2, pixels);
		
		Quadrado q3 = new Quadrado();
		setBottomAnchor(q3, pixels);
		setLeftAnchor(q3, pixels);
		
		Quadrado q4 = new Quadrado();
		setBottomAnchor(q4, pixels);
		setRightAnchor(q4, pixels);
		
		Quadrado q5 = new Quadrado();
		
		HBox centro = new HBox();
		centro.setAlignment(Pos.CENTER);
		centro.getChildren().add(q5);
		
		setLeftAnchor(centro, 110.0);
		setRightAnchor(centro, 110.0);
		setTopAnchor(centro, 110.0);
		setBottomAnchor(centro, 110.0);
		
		getChildren().addAll(q1, q2, q3, q4, centro);
	}
}
