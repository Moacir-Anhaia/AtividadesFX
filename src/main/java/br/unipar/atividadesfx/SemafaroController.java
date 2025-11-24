package br.unipar.atividadesfx;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import static javafx.scene.paint.Color.*;

public class SemafaroController {

    @FXML
    private Circle cVer, cAma, cGre;

    private Timeline timeline;
    private int alternar = 0;

    @FXML
    private void initialize() {

        acendeVermelho();

        timeline = new Timeline(
                new KeyFrame(Duration.seconds(2), e -> proximoEstado())
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
    }

    private void proximoEstado() {
        alternar = (alternar + 1) % 3;

        switch (alternar) {
            case 0 -> acendeVermelho();
            case 1 -> acendeVerde();
            case 2 -> acendeAmarelo();
        }
    }

    private void acendeVermelho() {
        cVer.setFill(RED);
        cAma.setFill(GRAY);
        cGre.setFill(GRAY);
    }

    private void acendeVerde() {
        cVer.setFill(GRAY);
        cAma.setFill(GRAY);
        cGre.setFill(GREEN);
    }

    private void acendeAmarelo() {
        cVer.setFill(GRAY);
        cAma.setFill(YELLOW);
        cGre.setFill(GRAY);
    }

    @FXML
    private void Inicio() {
        if (timeline != null) {
            timeline.play();
        }
    }

    @FXML
    private void Parar() {
        if (timeline != null) {
            timeline.stop();
        }
    }

    @FXML
    private void Voltar() {
        HelloApplication.mudarCena("HubInicial");
    }
}
