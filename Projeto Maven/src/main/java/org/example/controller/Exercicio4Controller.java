package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.example.App;

import java.io.IOException;

public class Exercicio4Controller {

    @FXML private TextField txtTemperatura;
    @FXML private TextArea txtSaida;

    private double soma = 0;
    private int quantidade = 0;

    @FXML
    private void inserirTemp() {
        try {
            double temp = Double.parseDouble(txtTemperatura.getText());
            soma += temp;
            quantidade++;

            String estado = (temp < 18) ? "Frio" : "Agradável";
            txtSaida.appendText(String.format("Temp %d: %.1f °C - %s\n", quantidade, temp, estado));
            txtTemperatura.clear();
        } catch (NumberFormatException e) {
            txtSaida.appendText("Digite uma temperatura válida.\n");
        }
    }

    @FXML
    private void calcularMedia() {
        if (quantidade == 0) return;
        double media = soma / quantidade;
        txtSaida.appendText(String.format("\nMédia: %.2f °C\n", media));
        if (media < 18) {
            txtSaida.appendText("Faz frio em São José dos Campos.\n");
        } else {
            txtSaida.appendText("A temperatura é agradável em São José dos Campos.\n");
        }
    }

    @FXML
    private void voltar() throws IOException {
        App.setRoot("primary");
    }
}