package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.entity.Trilha;

import java.io.IOException;

public class TrilhaController {
    @FXML private TextField txtNome;
    @FXML private TextField txtExtensao;
    @FXML private TextField txtDificuldade;
    @FXML private Label lblResultado;

    @FXML
    private void cadastrarTrilha() {
        try {
            Trilha t = new Trilha(
                    txtNome.getText(),
                    Double.parseDouble(txtExtensao.getText()),
                    txtDificuldade.getText()
            );
            lblResultado.setText(String.format("Trilha: %s - %.1f km (%s)", t.getNome(), t.getExtensaoKm(), t.getDificuldade()));
        } catch(Exception e) {
            lblResultado.setText("Erro nos dados informados.");
        }
    }

    @FXML private void voltar() throws IOException { App.setRoot("primary"); }
}