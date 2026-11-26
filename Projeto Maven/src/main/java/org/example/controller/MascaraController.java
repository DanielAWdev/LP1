package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.entity.Mascara;

import java.io.IOException;

public class MascaraController {
    @FXML private TextField txtCor;
    @FXML private TextField txtComprimento;
    @FXML private TextField txtEstilo;
    @FXML private TextField txtMaterial;
    @FXML private TextField txtUso;
    @FXML private Label lblResultado;

    @FXML
    private void cadastrarMascara() {
        try {
            Mascara m = new Mascara();
            m.mascara(
                    txtCor.getText(),
                    Double.parseDouble(txtComprimento.getText()),
                    txtEstilo.getText(),
                    txtMaterial.getText(),
                    txtUso.getText()
            );
            lblResultado.setText(String.format("Máscara %s de %s (Uso: %s)",
                    m.getEstilo(), m.getMaterial(), m.getUso()));
        } catch(Exception e) {
            lblResultado.setText("Erro nos dados informados.");
        }
    }

    @FXML
    private void voltar() throws IOException {
        App.setRoot("primary");
    }
}