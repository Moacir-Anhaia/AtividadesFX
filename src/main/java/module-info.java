module br.unipar.atividadesfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens br.unipar.atividadesfx to javafx.fxml;
    exports br.unipar.atividadesfx;
}