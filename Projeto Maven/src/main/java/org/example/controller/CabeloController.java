package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.entity.Cabelo;
import org.example.entity.*;
import java.io.IOException;

public class CabeloController {
    @FXML private TextField txtCor;
    @FXML private TextField txtComprimento;
    @FXML private TextField txtEstilo;
    @FXML private TextField txtTipo;
    @FXML private TextField txtTextura;
    @FXML private Label lblResultado;

    @FXML
    private void cadastrarCabelo() {
        try {
            Cabelo c = new Cabelo(
                    txtCor.getText(),
                    Double.parseDouble(txtComprimento.getText()),
                    txtEstilo.getText(),
                    txtTipo.getText(),
                    txtTextura.getText()
            );
            lblResultado.setText(String.format("Cabelo %s, Estilo %s (%.1f cm)",
                    c.getCor(), c.getEstilo(), c.getComprimento()));
        } catch(Exception e) {
            lblResultado.setText("Erro nos dados informados.");
        }
    }

    @FXML
    private void voltar() throws IOException {
        App.setRoot("primary");
    }
}
