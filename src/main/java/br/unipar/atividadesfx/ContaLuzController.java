package br.unipar.atividadesfx;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ContaLuzController {
    @FXML
    private TextField txtNome, txtKwh;
    @FXML
    private ComboBox<String> cbResidencia;
    @FXML
    private Label lblResultado;

    @FXML
    private void initialize() {
        cbResidencia.getItems().addAll(
                "Residencial", "Comercial", "Industrial"
        );}

    @FXML
    private void Calcular(){
        String nome = txtNome.getText();
        Double kwh = Double.valueOf(txtKwh.getText());
        String residencia = cbResidencia.getValue();

        double valor = 0;

        if(residencia.equals("Residencial")){
             valor = kwh * 0.60;
        }else if(residencia.equals("Comercial")){
            valor = kwh * 0.48;
        }else if(residencia.equals("Industrial")){
             valor = kwh * 0.75;
        }


        lblResultado.setText("Cliente " + nome + "--- Tipo: " + residencia + "\n" +
                " -- Consumo: " + kwh + " --- Valor: R$ " + valor);
    }
    @FXML
    private void Voltar(){
        HelloApplication.mudarCena("HubInicial");
    }




}
