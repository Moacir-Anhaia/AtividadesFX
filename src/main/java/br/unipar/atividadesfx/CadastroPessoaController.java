package br.unipar.atividadesfx;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastroPessoaController {
    @FXML
    private TextField txtNome, txtIdade;
    @FXML
    private Label lblanalise;
    @FXML
    private CheckBox ckMasculino, ckFeminino, ckSim, ckNao;

    @FXML
    private void Analisar(){
        String obs = "";
        String sexo = "";
        String esporte = "";
        String nome = txtNome.getText();
        String idade = txtIdade.getText();
        if (ckMasculino.isSelected()) {
            sexo = "Masculino,";
        }else if (ckFeminino.isSelected()){
            sexo = "Feminino,";
        }
        if (ckSim.isSelected()){
            esporte = " gosta de praticar esportes";
        }else if (ckNao.isSelected()){
            esporte = " não gosta de esporte";
        }
        int idadeINT = Integer.parseInt(idade);
        if (idadeINT >= 18){
            obs = "Maior de idade";
        }else{
            obs= "Menor de idade";
        }
    lblanalise.setText(nome + ", " + idade + " Anos, do sexo  " + sexo  + esporte + "\n" + obs);

}
@FXML
private void Voltar(){
    HelloApplication.mudarCena("HubInicial");
}
}

