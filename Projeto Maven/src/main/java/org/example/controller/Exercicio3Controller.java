package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.example.App;

import java.io.IOException;

public class Exercicio3Controller {

    @FXML private TextField txtPreco;
    @FXML private TextField txtQtd;
    @FXML private TextArea txtExtrato;

    private double total = 0;

    @FXML
    private void adicionarProduto() {
        try {
            double preco = Double.parseDouble(txtPreco.getText());
            int qtd = Integer.parseInt(txtQtd.getText());
            double subtotal = preco * qtd;
            total += subtotal;

            txtExtrato.appendText(String.format("Item: %d x R$ %.2f = R$ %.2f\n", qtd, preco, subtotal));
            txtPreco.clear();
            txtQtd.clear();
        } catch (NumberFormatException e) {
            txtExtrato.appendText("Preencha valores numéricos válidos.\n");
        }
    }

    @FXML
    private void calcularTotal() {
        double desconto = 0;
        if (total > 100) {
            desconto = total * 0.10;
        }
        double valorFinal = total - desconto;

        txtExtrato.appendText(String.format("\nTotal: R$ %.2f\nDesconto: R$ %.2f\nVALOR FINAL: R$ %.2f\n", total, desconto, valorFinal));
    }

    @FXML
    private void voltar() throws IOException {
        App.setRoot("primary");
    }
}