package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import org.example.App;

import java.io.IOException;

public class Exercicio2Controller {

    @FXML private PasswordField txtSenha;
    @FXML private Label lblResultado;

    @FXML
    private void autenticar() {
        if ("1234".equals(txtSenha.getText())) {
            lblResultado.setText("Acesso Permitido (Senha Correta)");
        } else {
            lblResultado.setText("Acesso Negado (Senha Errada)");
        }
    }

    @FXML
    private void voltar() throws IOException {
        App.setRoot("primary");
    }
}