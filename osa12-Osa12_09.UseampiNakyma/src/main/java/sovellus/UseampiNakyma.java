package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UseampiNakyma extends Application {

    @Override
    public void start(Stage ikkuna) {
        Label teksti1 = new Label("Eka näkymä!");
        Button nappi1 = new Button("Tokaan näkymään!");
        Label teksti2 = new Label("Toka näkymä!");
        Button nappi2 = new Button("Kolmanteen näkymään!");
        Label teksti3 = new Label("Kolmas näkymä!");
        Button nappi3 = new Button("Ekaan näkymään!");

        BorderPane asettelu1 = new BorderPane();
        asettelu1.setTop(teksti1);
        asettelu1.setCenter(nappi1);

        VBox asettelu2 = new VBox();
        asettelu2.getChildren().addAll(nappi2, teksti2);

        GridPane asettelu3 = new GridPane();
        asettelu3.add(teksti3, 0, 0);
        asettelu3.add(nappi3, 1, 1);


        //Button edes = new Button("Edes ..");
        //Button takaisin = new Button(".. takaisin.");
        Scene nakyma1 = new Scene(asettelu1);
        Scene nakyma2 = new Scene(asettelu2);
        Scene nakyma3 = new Scene(asettelu3);

        nappi1.setOnAction((event) -> {
            ikkuna.setScene(nakyma2);
        });

        nappi2.setOnAction((event) -> {
            ikkuna.setScene(nakyma3);
        });

        nappi3.setOnAction((event) -> {
            ikkuna.setScene(nakyma1);
        });

        ikkuna.setScene(nakyma1);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(UseampiNakyma.class);
    }
}
