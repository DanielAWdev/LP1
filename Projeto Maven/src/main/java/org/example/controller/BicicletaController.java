package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.entity.Bicicleta;
import org.example.entity.*;
import java.io.IOException;

public class BicicletaController {
    @FXML private TextField txtMarca;
    @FXML private TextField txtMarcha;
    @FXML private TextField txtVelocidade;
    @FXML private TextField txtTipo;
    @FXML private TextField txtPeso;
    @FXML private Label lblResultado;

    @FXML
    private void cadastrarBicicleta() {
        try {
            Bicicleta b = new Bicicleta(
                    txtMarca.getText(),
                    Integer.parseInt(txtMarcha.getText()),
                    Double.parseDouble(txtVelocidade.getText()),
                    txtTipo.getText(),
                    Double.parseDouble(txtPeso.getText())
            );
            lblResultado.setText(String.format("Bicicleta %s (%s) - %.1f kg",
                    b.getMarca(), b.getTipo(), b.getPeso()));
        } catch(Exception e) {
            lblResultado.setText("Erro nos dados informados.");
        }
    }

    @FXML
    private void voltar() throws IOException {
        App.setRoot("primary");
    }
}