package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.entity.Capacete;
import org.example.entity.*;
import java.io.IOException;

public class CapaceteController {
    @FXML private TextField txtMarca;
    @FXML private TextField txtTamanho;
    @FXML private CheckBox chkVisor;
    @FXML private Label lblResultado;

    @FXML
    private void cadastrarCapacete() {
        try {
            Capacete c = new Capacete(
                    txtMarca.getText(),
                    txtTamanho.getText(),
                    chkVisor.isSelected()
            );
            String visorStr = c.isComVisor() ? "Com visor" : "Sem visor";
            lblResultado.setText(String.format("Capacete %s, Tamanho %s (%s)", c.getMarca(), c.getTamanho(), visorStr));
        } catch(Exception e) {
            lblResultado.setText("Erro nos dados informados.");
        }
    }

    @FXML private void voltar() throws IOException { App.setRoot("primary"); }
}