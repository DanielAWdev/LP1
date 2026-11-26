package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.entity.Loja;

import java.io.IOException;

public class LojaController {
    @FXML private TextField txtNome;
    @FXML private TextField txtEndereco;
    @FXML private TextField txtGerente;
    @FXML private Label lblResultado;

    @FXML
    private void cadastrarLoja() {
        try {
            Loja l = new Loja(
                    txtNome.getText(),
                    txtEndereco.getText(),
                    txtGerente.getText()
            );
            l.abrirPortas();
            lblResultado.setText(String.format("Loja: %s | Gerente: %s", l.getNome(), l.getGerente()));
        } catch (Exception e) {
            lblResultado.setText("Erro nos dados informados.");
        }
    }

    @FXML private void voltar() throws IOException { App.setRoot("primary"); }
}