package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.entity.Colecionador;

import java.io.IOException;

public class ColecionadorController {
    @FXML private TextField txtNome;
    @FXML private TextField txtQuantidadePecas;
    @FXML private TextField txtPaisOrigem;
    @FXML private Label lblResultado;

    @FXML
    private void cadastrarColecionador() {
        try {
            Colecionador c = new Colecionador(
                    txtNome.getText(),
                    Integer.parseInt(txtQuantidadePecas.getText()),
                    txtPaisOrigem.getText()
            );
            lblResultado.setText(String.format("Colecionador: %s de %s (%d peças)", c.getNome(), c.getPaisOrigem(), c.getQuantidadePecas()));
        } catch(Exception e) {
            lblResultado.setText("Erro nos dados informados.");
        }
    }

    @FXML private void voltar() throws IOException { App.setRoot("primary"); }
}