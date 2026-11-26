package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.entity.Acessorio;
import org.example.entity.*;

import java.io.IOException;

public class AcessorioController {
    @FXML private TextField txtNome;
    @FXML private TextField txtMaterial;
    @FXML private TextField txtPreco;
    @FXML private Label lblResultado;

    @FXML
    public void cadastrarAcessorio() {
        try {
            Acessorio acc = new Acessorio(
                    txtNome.getText(),
                    txtMaterial.getText(),
                    Double.parseDouble(txtPreco.getText())
            );
            lblResultado.setText(String.format("Acessório: %s (%s) por R$ %.2f",
                    acc.getNome(), acc.getMaterial(), acc.getPreco()));
        } catch (Exception e) {
            lblResultado.setText("Erro ao cadastrar acessório.");
        }
    }

    @FXML
    public void voltar() throws IOException { App.setRoot("primary"); }
}