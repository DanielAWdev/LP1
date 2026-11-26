package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.entity.SalaoBeleza;

import java.io.IOException;

public class SalaoBelezaController {
    @FXML private TextField txtNome;
    @FXML private TextField txtCabeleireiro;
    @FXML private TextField txtFaturamento;
    @FXML private Label lblResultado;

    @FXML
    private void cadastrarSalao() {
        try {
            SalaoBeleza s = new SalaoBeleza(
                    txtNome.getText(),
                    txtCabeleireiro.getText(),
                    Double.parseDouble(txtFaturamento.getText())
            );
            lblResultado.setText(String.format("Salão: %s | Resp: %s | Faturamento: R$ %.2f", s.getNome(), s.getCabeleireiroResponsavel(), s.getFaturamento()));
        } catch(Exception e) {
            lblResultado.setText("Erro nos dados informados.");
        }
    }

    @FXML private void voltar() throws IOException { App.setRoot("primary"); }
}