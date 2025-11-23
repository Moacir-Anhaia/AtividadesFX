package br.unipar.atividadesfx;

import javafx.fxml.FXML;

public class HubController {

    @FXML
    private void btnCalculadora() {
        HelloApplication.mudarCena("Calculadora");
    }
    @FXML
    private void btnConversor() {
        HelloApplication.mudarCena("ConversorTemperatura");
    }
    @FXML
    private void btnCadastro() {
        HelloApplication.mudarCena("CadastroPessoa");
    }

}
