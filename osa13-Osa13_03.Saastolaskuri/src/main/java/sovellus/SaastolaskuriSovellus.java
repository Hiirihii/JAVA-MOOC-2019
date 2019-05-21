package sovellus;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SaastolaskuriSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {

        Laskuri laskuri = new Laskuri();
        //kokonais asettelu
        BorderPane kaytto = new BorderPane();

        //keskikaavio
        NumberAxis X = new NumberAxis(0, 30, 1);
        NumberAxis Y = new NumberAxis();

        LineChart kaavio = new LineChart(X, Y);
        kaavio.setAnimated(false);
        kaavio.setTitle("Säästölaskuri");
        kaavio.setLegendVisible(false);
        //ylälaita

        //asettelua
        VBox ylalaitaAsettelu = new VBox();
        ylalaitaAsettelu.setSpacing(30);
        ylalaitaAsettelu.setAlignment(Pos.CENTER);
        ylalaitaAsettelu.setPadding(new Insets(20, 20, 20, 20));

        BorderPane ylempiSlid = new BorderPane();
        BorderPane alempiSlid = new BorderPane();

        Slider kkTallennus = new Slider(25, 250, 25);
        kkTallennus.setShowTickLabels(true);
        kkTallennus.setShowTickMarks(true);

        Slider vKorko = new Slider(0, 10, 0.0);
        vKorko.setShowTickLabels(true);
        vKorko.setShowTickMarks(true);

        Label kuukausiTeksti = new Label("Kuukausittainen tallennus");
        Label korkoTeksti = new Label("Vuosittainen korko");
        Label kkSliderArvo = new Label("25.0");
        Label vSliderArvo = new Label("0.0");

        ylempiSlid.setLeft(kuukausiTeksti);
        ylempiSlid.setCenter(kkTallennus);
        ylempiSlid.setRight(kkSliderArvo);

        alempiSlid.setLeft(korkoTeksti);
        alempiSlid.setCenter(vKorko);
        alempiSlid.setRight(vSliderArvo);

        //käyrät
        XYChart.Series saasto = new XYChart.Series<>();
        XYChart.Series saastoJaKorko = new XYChart.Series<>();
        kaavio.getData().addAll(saasto, saastoJaKorko);
        
        double maara = kkTallennus.getValue();
                System.out.println(maara);
        maara = maara + kkTallennus.getValue() * 11;
                System.out.println(maara);
        
        laskuri.laskeArvot(kkTallennus, saasto);
        laskuri.laskeArvotKorolla(kkTallennus, vKorko, saastoJaKorko);

        kkTallennus.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                saasto.getData().clear();
                saastoJaKorko.getData().clear();
                kkSliderArvo.setText(String.format("%.1f", kkTallennus.getValue()));
                laskuri.laskeArvot(kkTallennus, saasto);
                laskuri.laskeArvotKorolla(kkTallennus, vKorko, saastoJaKorko);
            }
        });
        vKorko.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                saastoJaKorko.getData().clear();
                vSliderArvo.setText(String.format("%.2f", vKorko.getValue()));
                laskuri.laskeArvotKorolla(kkTallennus, vKorko, saastoJaKorko);
            }
        });
        //viimeistely
        ylalaitaAsettelu.getChildren().addAll(ylempiSlid, alempiSlid);
        kaytto.setTop(ylalaitaAsettelu);
        kaytto.setCenter(kaavio);

        Scene nakyma = new Scene(kaytto, 600, 450);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(SaastolaskuriSovellus.class);
    }

}
