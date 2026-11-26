package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.entity.Personagem;

import java.io.IOException;

public class PersonagemController {
    @FXML private TextField txtNome;
    @FXML private TextField txtAnime;
    @FXML private TextField txtPoder;
    @FXML private Label lblResultado;

    @FXML
    private void cadastrarPersonagem() {
        try {
            Personagem p = new Personagem(
                    txtNome.getText(),
                    txtAnime.getText(),
                    Integer.parseInt(txtPoder.getText())
            );
            lblResultado.setText(String.format("Personagem: %s (%s) - Poder: %d", p.getNome(), p.getAnime(), p.getPoder()));
        } catch(Exception e) {
            lblResultado.setText("Erro nos dados informados.");
        }
    }

    @FXML private void voltar() throws IOException { App.setRoot("primary"); }
}