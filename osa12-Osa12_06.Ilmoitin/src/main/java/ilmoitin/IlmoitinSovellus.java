package ilmoitin;

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

public class IlmoitinSovellus extends Application {
    
    

    @Override
    public void start(Stage ikkuna) {
        TextField ylinTeksti = new TextField();
        Label alinTeksti = new Label();
        Button nappi = new Button("Päivitä");

        nappi.setOnAction((event) -> {
            alinTeksti.setText(ylinTeksti.getText());
        });

        VBox komponenttiryhma = new VBox();
        komponenttiryhma.setSpacing(10);
        komponenttiryhma.getChildren().addAll(ylinTeksti, nappi, alinTeksti);

        Scene nakyma = new Scene(komponenttiryhma);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(IlmoitinSovellus.class);
    }

}
