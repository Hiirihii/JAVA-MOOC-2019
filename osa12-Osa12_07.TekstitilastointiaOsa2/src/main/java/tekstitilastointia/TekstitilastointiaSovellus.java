package tekstitilastointia;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import java.util.Arrays;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.ChangeListener;
import java.util.Observable;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TekstitilastointiaSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        BorderPane asettelu = new BorderPane();

        TextArea tekstiAlue = new TextArea();
        Label vasenTeksti = new Label("Kirjaimia: ");
        Label keskiTeksti = new Label("Sanoja: ");
        Label oikeaTeksti = new Label("Pisin sana on:");

        HBox komponenttiryhma = new HBox();
        komponenttiryhma.setSpacing(10);
        komponenttiryhma.getChildren().addAll(vasenTeksti, keskiTeksti, oikeaTeksti);

        asettelu.setBottom(komponenttiryhma);

        asettelu.setCenter(tekstiAlue);

        tekstiAlue.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
            int merkkeja = uusiArvo.length();
            String[] palat = uusiArvo.split(" ");
            int sanoja = palat.length;
            String pisin = Arrays.stream(palat)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            vasenTeksti.setText("Kirjaimia: " + merkkeja);
            keskiTeksti.setText("Sanoja: " + sanoja);
            oikeaTeksti.setText("Pisin sana on: " + pisin);

        });

        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();

    }

    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }

}
