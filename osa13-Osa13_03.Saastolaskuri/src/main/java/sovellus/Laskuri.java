package sovellus;

import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Slider;

public class Laskuri {

    public Laskuri() {

    }

    public void laskeArvot(Slider talletus, Series kayra) {
        kayra.getData().add(new XYChart.Data<>(0, 0));

        int vuosi = 1;
        double maara =talletus.getValue();

        while (vuosi <= 30) {

            maara = maara + talletus.getValue() * 12;

            kayra.getData().add(new XYChart.Data<>(vuosi, maara));
            vuosi++;
        }
        
    }

    public void laskeArvotKorolla(Slider talletus, Slider korko, Series kayra) {
        if (!(korko.getValue() == 0)) {

            kayra.getData().add(new XYChart.Data<>(0, 0));

            double kksumma = talletus.getValue();
            double vuosisumma = 0;

            int vuosi = 1;

            while (vuosi <= 30) {

                kksumma = kksumma + kksumma * korko.getValue() / 100;
                vuosisumma += kksumma * 12;
                kayra.getData().add(new XYChart.Data<>(vuosi, vuosisumma));
                vuosi++;
                    
            }
        }

    }

}
