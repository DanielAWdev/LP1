package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;

import java.io.IOException;

public class Exercicio7Controller {

    @FXML private TextField txtDias;
    @FXML private TextField txtKm;
    @FXML private TextField txtLimite;
    @FXML private TextField txtDiaria;
    @FXML private TextField txtAdicional;
    @FXML private Label lblResultado;

    @FXML
    private void calcular() {
        try {
            int dias = Integer.parseInt(txtDias.getText());
            double km = Double.parseDouble(txtKm.getText());
            double limite = Double.parseDouble(txtLimite.getText());
            double diaria = Double.parseDouble(txtDiaria.getText());
            double adicional = Double.parseDouble(txtAdicional.getText());

            double custo = dias * diaria;
            if (km > limite) {
                custo += (km - limite) * adicional;
            }

            lblResultado.setText(String.format("Preço do aluguel: R$ %.2f", custo));
        } catch (NumberFormatException e) {
            lblResultado.setText("Preencha todos os campos corretamente.");
        }
    }

    @FXML
    private void voltar() throws IOException {
        App.setRoot("primary");
    }
}