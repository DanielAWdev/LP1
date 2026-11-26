package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.entity.Calcado;
import org.example.entity.*;
import java.io.IOException;

public class CalcadoController {
    @FXML private TextField txtModelo;
    @FXML private TextField txtNumeracao;
    @FXML private TextField txtPreco;
    @FXML private TextField txtCor;
    @FXML private Label lblResultado;

    @FXML
    private void cadastrarCalcado() {
        try {
            Calcado calcado = new Calcado(
                    txtModelo.getText(),
                    Integer.parseInt(txtNumeracao.getText()),
                    Double.parseDouble(txtPreco.getText()),
                    txtCor.getText()
            );
            lblResultado.setText(String.format("Calçado: %s, Tamanho %d - R$ %.2f",
                    calcado.getModelo(), calcado.getNumeracao(), calcado.getPreco()));
        } catch (Exception e) {
            lblResultado.setText("Erro nos dados informados.");
        }
    }

    @FXML private void voltar() throws IOException { App.setRoot("primary"); }
}