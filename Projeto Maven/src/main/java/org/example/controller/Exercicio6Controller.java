package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;

import java.io.IOException;

public class Exercicio6Controller {

    @FXML private TextField txtDistancia;
    @FXML private TextField txtPreco;
    @FXML private Label lblResultado;

    @FXML
    private void calcular() {
        try {
            double viagem = Double.parseDouble(txtDistancia.getText());
            double preco = Double.parseDouble(txtPreco.getText());

            double custo = (viagem / 12.0) * preco;

            if (viagem > 500) {
                double comDesconto = custo - (custo * 0.05);
                lblResultado.setText(String.format("Custo: R$ %.2f | Com Desconto: R$ %.2f", custo, comDesconto));
            } else {
                lblResultado.setText(String.format("Custo total da viagem: R$ %.2f", custo));
            }
        } catch (NumberFormatException e) {
            lblResultado.setText("Preencha valores válidos.");
        }
    }

    @FXML
    private void voltar() throws IOException {
        App.setRoot("primary");
    }
}