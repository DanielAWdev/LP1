package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.entity.Roupa;

import java.io.IOException;

public class RoupaController {
    @FXML private TextField txtTipo;
    @FXML private TextField txtTamanho;
    @FXML private TextField txtPreco;
    @FXML private TextField txtCor;
    @FXML private TextField txtMarca;
    @FXML private Label lblResultado;

    @FXML
    private void cadastrarRoupa() {
        try {
            Roupa roupa = new Roupa(
                    txtTipo.getText(),
                    txtTamanho.getText(),
                    Double.parseDouble(txtPreco.getText()),
                    txtCor.getText(),
                    txtMarca.getText()
            );
            lblResultado.setText(String.format("Roupa cadastrada: %s (%s) - R$ %.2f [%s]",
                    roupa.getTipo(), roupa.getTamanho(), roupa.getPreco(), roupa.getMarca()));
        } catch (Exception e) {
            lblResultado.setText("Preencha os campos corretamente.");
        }
    }

    @FXML private void voltar() throws IOException { App.setRoot("primary"); }
}