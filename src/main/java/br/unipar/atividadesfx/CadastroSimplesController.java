package br.unipar.atividadesfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class CadastroSimplesController {

    @FXML
    private TextField txtNome, txtIdade;

    @FXML
    private ComboBox<String> cbxCurso;

    @FXML
    private TableView<Aluno> tbAluno;

    @FXML
    private TableColumn<Aluno, String> tbNome;

    @FXML
    private TableColumn<Aluno, Integer> tbIdade;

    @FXML
    private TableColumn<Aluno, String> tbCurso;

    private final ObservableList<Aluno> listaAlunos =
            FXCollections.observableArrayList();

    @FXML
    private void initialize() {

        cbxCurso.getItems().addAll(
                "ADS", "Enfermagem", "Direito", "Administração"
        );

        tbNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        tbIdade.setCellValueFactory(new PropertyValueFactory<>("idade"));
        tbCurso.setCellValueFactory(new PropertyValueFactory<>("curso"));

        tbAluno.setItems(listaAlunos);
    }

    @FXML
    private void Adicionar() {
        String nome = txtNome.getText().trim();
        String idadeStr = txtIdade.getText().trim();
        String curso = cbxCurso.getValue();

        if (nome.isEmpty() || idadeStr.isEmpty() || curso == null) {
            System.out.println("Preencha nome, idade e curso.");
            return;
        }

        int idade;
        try {
            idade = Integer.parseInt(idadeStr);
        } catch (NumberFormatException e) {
            System.out.println("Idade inválida.");
            return;
        }

        Aluno aluno = new Aluno(nome, idade, curso);
        listaAlunos.add(aluno);

        txtNome.clear();
        txtIdade.clear();
        cbxCurso.getSelectionModel().clearSelection();
    }

    @FXML
    private void Excluir() {
        Aluno selecionado = tbAluno.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            listaAlunos.remove(selecionado);
        }
    }

    @FXML
    private void Voltar() {
        HelloApplication.mudarCena("HubInicial");
    }
}
