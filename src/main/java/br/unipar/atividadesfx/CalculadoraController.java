package br.unipar.atividadesfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculadoraController {
    @FXML
    private TextField tfPrimeiroValor, tfSegundoValor;
    @FXML
    private Label lblResultado;

    private double lerValor(TextField tf) {
        String texto = tf.getText().replace(",", ".");
        return Double.parseDouble(texto);
    }
    @FXML
    private void Soma(){
        double valor1 = lerValor(tfPrimeiroValor);
        double valor2 = lerValor(tfSegundoValor);
        lblResultado.setText(String.valueOf(valor1 + valor2));
    }
    @FXML
    private void Subtrair(){
        double valor1 = lerValor(tfPrimeiroValor);
        double valor2 = lerValor(tfSegundoValor);
        lblResultado.setText(String.valueOf(valor1 - valor2));
    }
    @FXML
    private void Dividir(){
        double valor1 = lerValor(tfPrimeiroValor);
        double valor2 = lerValor(tfSegundoValor);
        lblResultado.setText(String.valueOf(valor1 / valor2));
    }
    @FXML
    private void Multiplicar(){
        double valor1 = lerValor(tfPrimeiroValor);
        double valor2 = lerValor(tfSegundoValor);
        lblResultado.setText(String.valueOf(valor1 * valor2));
    }
@FXML
    private void Voltar(){
    HelloApplication.mudarCena("Hubinicial");
}

}
