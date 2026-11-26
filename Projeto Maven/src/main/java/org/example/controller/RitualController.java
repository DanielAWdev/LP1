package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.entity.Ritual;

import java.io.IOException;

public class RitualController {
    @FXML private TextField txtNome;
    @FXML private TextField txtObjetivo;
    @FXML private TextField txtHorario;
    @FXML private Label lblResultado;

    @FXML
    private void cadastrarRitual() {
        try {
            Ritual r = new Ritual(
                    txtNome.getText(),
                    txtObjetivo.getText(),
                    txtHorario.getText()
            );
            lblResultado.setText(String.format("Ritual: %s (Objetivo: %s às %s)", r.getNome(), r.getObjetivo(), r.getHorario()));
        } catch(Exception e) {
            lblResultado.setText("Erro nos dados informados.");
        }
    }

    @FXML private void voltar() throws IOException { App.setRoot("primary"); }
}