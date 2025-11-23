package br.unipar.atividadesfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ConversorTemperaturaController {
    @FXML
    private TextField txtValor;
    @FXML
    private Label lblResultado;

    @FXML
    private void ConveterC(){
        double valor = Integer.parseInt(txtValor.getText());
        double celsius = (valor - 32) * 5 / 9;
    lblResultado.setText("Celsius: " + celsius + " °");
    }
    @FXML
    private void ConveterF(){
        double valor = Integer.parseInt(txtValor.getText());
        double fahrenheit = valor * 9 / 5 + 32;
        lblResultado.setText("fahrenheit: " + fahrenheit + " °");
    }
    @FXML
    private void Voltar() {
        HelloApplication.mudarCena("HubInicial");
    }

}
