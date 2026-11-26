package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;

import java.io.IOException;

public class Exercicio5Controller {

    @FXML private TextField txtCamelos;
    @FXML private TextField txtParte1;
    @FXML private TextField txtParte2;
    @FXML private TextField txtParte3;
    @FXML private Label lblResultado;

    @FXML
    private void calcular() {
        try {
            int camelos = Integer.parseInt(txtCamelos.getText());
            int p1 = Integer.parseInt(txtParte1.getText());
            int p2 = Integer.parseInt(txtParte2.getText());
            int p3 = Integer.parseInt(txtParte3.getText());

            int totalComAdicao = camelos + 1;
            int primeiro = totalComAdicao / p1;
            int segundo = totalComAdicao / p2;
            int terceiro = totalComAdicao / p3;

            int totalDistribuido = primeiro + segundo + terceiro;
            int sobra = totalComAdicao - totalDistribuido;

            lblResultado.setText(String.format(
                    "1º: %d camelos | 2º: %d camelos | 3º: %d camelos\nTotal distribuído: %d | Sobra: %d",
                    primeiro, segundo, terceiro, totalDistribuido, sobra
            ));
        } catch (Exception e) {
            lblResultado.setText("Erro ao calcular a divisão.");
        }
    }

    @FXML
    private void voltar() throws IOException {
        App.setRoot("primary");
    }
}