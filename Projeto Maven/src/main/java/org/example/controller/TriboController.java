package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.entity.Tribo;

import java.io.IOException;

public class TriboController {
    @FXML private TextField txtNome;
    @FXML private TextField txtRegiao;
    @FXML private TextField txtPopulacao;
    @FXML private Label lblResultado;

    @FXML
    private void cadastrarTribo() {
        try {
            Tribo t = new Tribo(
                    txtNome.getText(),
                    txtRegiao.getText(),
                    Integer.parseInt(txtPopulacao.getText())
            );
            lblResultado.setText(String.format("Tribo: %s (%s) - %d pessoas", t.getNome(), t.getRegiao(), t.getPopulacao()));
        } catch(Exception e) {
            lblResultado.setText("Erro nos dados informados.");
        }
    }

    @FXML private void voltar() throws IOException { App.setRoot("primary"); }
}