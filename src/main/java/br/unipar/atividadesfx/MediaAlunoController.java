package br.unipar.atividadesfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MediaAlunoController {
    @FXML
    private TextField txtAluno, txtNota1, txtNota2, txtNota3;
    @FXML
    private Label lblResultado;

    @FXML
    private void Calcular() {
        String n1 = txtNota1.getText().replace(",", ".").trim();
        double nota1 = Double.parseDouble(n1);
        String n2 = txtNota2.getText().replace(",", ".").trim();
        double nota2 = Double.parseDouble(n2);
        String n3 = txtNota3.getText().replace(",", ".").trim();
        double nota3 = Double.parseDouble(n3);

        String situacao = "";
        String nome = txtAluno.getText();


        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            situacao = "Aprovado";
        } else if (media >= 4) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }
        lblResultado.setText("Aluno " + nome + " -- " + "média: " + media + " -- " + situacao);
    }
        @FXML
          private void Voltar() {
            HelloApplication.mudarCena("HubInicial");
    }
}
