package sovellus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PuolueetSovellus extends Application {

    @Override
    public void start(Stage ikkuna) throws FileNotFoundException {
        // luodaan kaaviossa käytettävät x- ja y-akselit
        NumberAxis xAkseli = new NumberAxis(1967, 2009, 4);
        NumberAxis yAkseli = new NumberAxis();

        // asetetaan akseleille nimet
        //xAkseli.setLabel("Vuosi");
        //yAkseli.setLabel("Sijoitus");
        // luodaan viivakaavio. Viivakaavion arvot annetaan numeroina
        // ja se käyttää aiemmin luotuja x- ja y-akseleita
        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setTitle("Puolueiden suhteellinen kannatus");

        Map<Integer, Double> vuosiJaKannatus = new HashMap<>();
        Map<String, Map<Integer, Double>> puolueenKannatus = new HashMap<>();

        try (Scanner tiedostonLukija = new Scanner(new File("puoluedata.tsv"))) {

            while (tiedostonLukija.hasNextLine()) {

                String rivi = tiedostonLukija.nextLine();
                String[] palat = rivi.split("\t");
                String puolueTunnus = palat[0];
                System.out.println(puolueTunnus);

                if (palat[0].equals("Puolue")) {
                    continue;

                }

                int vuosi = 1968;
                double kannatusProsentti = 0.0;
                int i = 1;

                while (i < palat.length) {
                    kannatusProsentti = Double.valueOf(palat[i]);
                    vuosiJaKannatus.put(vuosi, kannatusProsentti);
                    System.out.println(vuosi + "/" + kannatusProsentti);
                    i++;
                    vuosi = vuosi + 4;

                }

                puolueenKannatus.put(puolueTunnus, vuosiJaKannatus);

                System.out.println("\n");

                // käydään puolueet läpi ja lisätään ne kaavioon
                puolueenKannatus.keySet().stream().forEach(puolue -> {
                    // jokaiselle puolueelle luodaan oma datajoukko
                    XYChart.Series data = new XYChart.Series();
                    data.setName(puolue);

                    // datajoukkoon lisätään puolueen pisteet
                    puolueenKannatus.get(puolue).entrySet().stream().forEach(pari -> {
                        data.getData().add(new XYChart.Data(pari.getKey(), pari.getValue()));
                    });

                    // ja datajoukko lisätään kaavioon
                    viivakaavio.getData().add(data);
                });

            }

        }
        
        // näytetään viivakaavio
        Scene nakyma = new Scene(viivakaavio, 640, 480);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(PuolueetSovellus.class);
    }
}
