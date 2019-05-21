package hymio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HymioSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {

        Canvas piirtoalusta = new Canvas(640, 480);
        GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();

        piirturi.setLineWidth(2.0);
        // Set fill color
        piirturi.setFill(Color.BLACK);
        // Draw a filled rounded Rectangle
        piirturi.fillRoundRect(400, 50, 50, 50, 10, 0);
        piirturi.fillRoundRect(200, 50, 50, 50, 10, 0);

        piirturi.fillRoundRect(450, 200, 50, 50, 10, 0);
        piirturi.fillRoundRect(150, 200, 50, 50, 10, 0);
        piirturi.fillRoundRect(200, 250, 250, 50, 10, 0);

        BorderPane asettelu = new BorderPane();
        asettelu.setCenter(piirtoalusta);

        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(HymioSovellus.class);
    }
}
