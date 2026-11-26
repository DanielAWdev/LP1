package org.example.controller;

import javafx.fxml.FXML;

import java.io.IOException;

import static org.example.App.setRoot;

public class PrimaryController {


    @FXML
    public void abrirExercicio1() throws IOException { setRoot("controller/exercicio1"); }
    @FXML
    public void abrirExercicio2() throws IOException { setRoot("controller/exercicio2"); }
    @FXML private void abrirExercicio3() throws IOException { setRoot("controller/exercicio3"); }
    @FXML private void abrirExercicio4() throws IOException { setRoot("controller/exercicio4"); }
    @FXML private void abrirExercicio5() throws IOException { setRoot("controller/exercicio5"); }
    @FXML private void abrirExercicio6() throws IOException { setRoot("controller/exercicio6"); }
    @FXML private void abrirExercicio7() throws IOException { setRoot("controller/exercicio7"); }

    @FXML private void abrirRoupa() throws IOException { setRoot("controller/roupa"); }
    @FXML private void abrirCalcado() throws IOException { setRoot("controller/calcado"); }
    @FXML private void abrirAcessorio() throws IOException { setRoot("controller/acessorio"); }
    @FXML private void abrirLoja() throws IOException { setRoot("controller/loja"); }

    @FXML private void abrirBicicleta() throws IOException { setRoot("controller/bicicleta"); }
    @FXML private void abrirCiclista() throws IOException { setRoot("controller/ciclista"); }
    @FXML private void abrirTrilha() throws IOException { setRoot("controller/trilha"); }
    @FXML private void abrirCapacete() throws IOException { setRoot("controller/capacete"); }

    @FXML private void abrirMascara() throws IOException { setRoot("controller/mascara"); }
    @FXML private void abrirTribo() throws IOException { setRoot("tribo"); }
    @FXML private void abrirRitual() throws IOException { setRoot("controller/ritual"); }
    @FXML private void abrirColecionador() throws IOException { setRoot("controller/colecionador"); }


    @FXML private void abrirCabelo() throws IOException { setRoot("controller/cabelo"); }
    @FXML private void abrirPersonagem() throws IOException { setRoot("controller/personagem"); }
    @FXML private void abrirSalaoBeleza() throws IOException { setRoot("controller/salaobeleza"); }
    @FXML private void abrirTintura() throws IOException { setRoot("controller/tintura"); }
}
