package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.entity.Tintura;

import java.io.IOException;

public class TinturaController {
    @FXML private TextField txtMarca;
    @FXML private TextField txtCor;
    @FXML private CheckBox chkSemAmmonia;
    @FXML private Label lblResultado;

    @FXML
    private void cadastrarTintura() {
        try {
            Tintura t = new Tintura(
                    txtMarca.getText(),
                    txtCor.getText(),
                    chkSemAmmonia.isSelected()
            );
            String amoniaStr = t.isSemAmmonia() ? "Sem amônia" : "Com amônia";
            lblResultado.setText(String.format("Tintura %s - Cor %s (%s)", t.getMarca(), t.getCor(), amoniaStr));
        } catch(Exception e) {
            lblResultado.setText("Erro nos dados informados.");
        }
    }

    @FXML private void voltar() throws IOException { App.setRoot("primary"); }
}