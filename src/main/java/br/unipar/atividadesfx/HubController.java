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
    @FXML
    private void btnMedia() {
        HelloApplication.mudarCena("MediaAluno");
    }
    @FXML
    private void btnCadastroSimples() {
        HelloApplication.mudarCena("CadastroSimples");
    }
    @FXML
    private void btnMontagem() {
        HelloApplication.mudarCena("MontagemLanche");
    }
    @FXML
    private void btnSimulador() {
        HelloApplication.mudarCena("Semafaro");
    }
    @FXML
    private void btnJogo() {
        HelloApplication.mudarCena("Adivinhacao");
    }
    @FXML
    private void btmLuz() {
        HelloApplication.mudarCena("ContaLuz");
    }

}
