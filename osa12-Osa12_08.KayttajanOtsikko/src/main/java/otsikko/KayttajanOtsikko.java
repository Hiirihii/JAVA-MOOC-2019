package otsikko;

import javafx.application.Application;
import javafx.stage.Stage;

public class KayttajanOtsikko extends Application {

    @Override
    public void start(Stage ikkuna) {
           Parameters params = getParameters();
        String organisaatio = params.getNamed().get("organisaatio");
        String kurssi = params.getNamed().get("kurssi");

        ikkuna.setTitle(organisaatio + ": " + kurssi);
        ikkuna.show();
    }
}