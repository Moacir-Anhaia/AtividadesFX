package br.unipar.atividadesfx;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MontagemLancheController {
    @FXML
    private Label lblPedido;
    @FXML
    private ComboBox<String> cbPao;
    @FXML
    private TextField txtNome;
@FXML
    private RadioButton rbBovino, rbFrango, rbSoja;
@FXML
    private CheckBox ckQueijo, ckBacon, ckSalada, ckMolho;
@FXML
    private void initialize() {
        cbPao.getItems().addAll(
                "Francês",  "Integral", "Australiano"
        );
}
@FXML
    private void Gerar(){
        String nome = txtNome.getText();
        String acompanhamento = "";
        String carne = "";

if (ckQueijo.isSelected()){
    acompanhamento += " Queijo ";
}
if (ckBacon.isSelected()){
    acompanhamento += " Bacon ";
}
if (ckSalada.isSelected()){
    acompanhamento += " Salada ";
}
if (ckMolho.isSelected()){
    acompanhamento += " Molho ";
}

if (rbBovino.isSelected()){
    carne = "Bovino";
}else if (rbFrango.isSelected()){
    carne = "Frango";
}else if (rbSoja.isSelected()){
    carne = "Soja";
}

    String pao = cbPao.getValue();

lblPedido.setText("Pedido de " + nome + ": " + "pão " + pao + " com carne " + carne + " com os seguintes acompanhamentos:" + acompanhamento);
}
@FXML
    private void Voltar(){
    HelloApplication.mudarCena("HubInicial");
}
}
