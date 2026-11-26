package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.entity.Ciclista;
import org.example.entity.*;
import java.io.IOException;

public class CiclistaController {
    @FXML private TextField txtNome;
    @FXML private TextField txtIdade;
    @FXML private TextField txtQuilometragem;
    @FXML private Label lblResultado;

    @FXML
    private void cadastrarCiclista() {
        try {
            Ciclista c = new Ciclista(
                    txtNome.getText(),
                    Integer.parseInt(txtIdade.getText()),
                    Double.parseDouble(txtQuilometragem.getText())
            );
            lblResultado.setText(String.format("Ciclista: %s, %d anos (%.1f km)", c.getNome(), c.getIdade(), c.getQuilometragemTotal()));
        } catch(Exception e) {
            lblResultado.setText("Erro nos dados informados.");
        }
    }

    @FXML private void voltar() throws IOException { App.setRoot("primary"); }
}