package sovellus;

import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiSovellus extends Application {

    public void start(Stage ikkuna) {
        // luodaan kaaviossa käytettävät x- ja y-akselit
        NumberAxis xAkseli = new NumberAxis(2006, 2018, 4);
        NumberAxis yAkseli = new NumberAxis();

        // asetetaan akseleille nimet
        xAkseli.setLabel("Vuosi");
        yAkseli.setLabel("Sijoitus");

        // luodaan viivakaavio. Viivakaavion arvot annetaan numeroina
        // ja se käyttää aiemmin luotuja x- ja y-akseleita
        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setTitle("Helsingin yliopisto, Shanghai-ranking");

        Map<Integer, Integer> vuosiJaSija = new HashMap<>();
        Map<String, Map<Integer, Integer>> arvot = new HashMap<>();

        vuosiJaSija.put(2007, 73);
        vuosiJaSija.put(2008, 68);
        vuosiJaSija.put(2009, 72);
        vuosiJaSija.put(2010, 72);
        vuosiJaSija.put(2011, 74);
        vuosiJaSija.put(2012, 73);
        vuosiJaSija.put(2013, 76);
        vuosiJaSija.put(2014, 73);
        vuosiJaSija.put(2015, 67);
        vuosiJaSija.put(2016, 56);
        vuosiJaSija.put(2017, 56);
        String merkkijono = "KOK	16.1	18.1	20.9";
        String[] palat = merkkijono.split("\t");
   
        arvot.put(palat[0], vuosiJaSija);

        // käydään puolueet läpi ja lisätään ne kaavioon
        arvot.keySet().stream().forEach(puolue -> {
            // jokaiselle puolueelle luodaan oma datajoukko
            XYChart.Series data = new XYChart.Series();
            data.setName(puolue);

            // datajoukkoon lisätään puolueen pisteet
            arvot.get(puolue).entrySet().stream().forEach(pari -> {
                data.getData().add(new XYChart.Data(pari.getKey(), pari.getValue()));
            });

            // ja datajoukko lisätään kaavioon
            viivakaavio.getData().add(data);
        });

        // näytetään viivakaavio
        Scene nakyma = new Scene(viivakaavio, 640, 480);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(ShanghaiSovellus.class);
    }
}
