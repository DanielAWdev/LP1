package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;

import java.io.IOException;

public class Exercicio1Controller {

    @FXML private TextField txtNumero1;
    @FXML private TextField txtNumero2;
    @FXML private Label lblResultado;

    @FXML
    private void verificar() {
        try {
            int num1 = Integer.parseInt(txtNumero1.getText());
            int num2 = Integer.parseInt(txtNumero2.getText());

            if (num2 != 0 && num1 % num2 == 0) {
                lblResultado.setText("É múltiplo!");
            } else {
                lblResultado.setText("Não é múltiplo!");
            }
        } catch (NumberFormatException e) {
            lblResultado.setText("Por favor, informe números válidos.");
        }
    }

    @FXML
    private void voltar() throws IOException {
        App.setRoot("primary");
    }
}