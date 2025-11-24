package br.unipar.atividadesfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class AdivinhacaoController {
    @FXML
    private TextField txtNumero;

    @FXML
    private Label lblResultado;

    @FXML
    private void Validar() {
    int escolha = Integer.parseInt(txtNumero.getText());
        Random random = new Random();
        int numero = random.nextInt(11);

        if (escolha == numero) {
            lblResultado.setText("Acertou!");
        }else {
            lblResultado.setText("Errou! O número era " + numero);
        }
    }

@FXML
private void TentarNovamente() {
        txtNumero.clear();
        lblResultado.setText("Resultado");
}
    @FXML
    private void Voltar() {
        HelloApplication.mudarCena("HubInicial");
    }
}
