package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	
	@FXML
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;

	public void entrar() {
		boolean emailValido = campoEmail.getText().equals("a@b.com");
		boolean SenhaValida = campoSenha.getText().equals("12345");
		
		if (emailValido && SenhaValida) {
			Notifications.create()
				.title("Login FXML")
				.text("Login efetuado com sucesso!")
				.darkStyle()
				.showInformation();
		}
		else {
			Notifications.create()
			.title("Login FXML")
			.text("E-mail ou senha incorreto(s)!")
			.darkStyle()
			.showError();
		}
	}
}
