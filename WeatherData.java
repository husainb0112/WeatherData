import java.util.ArrayList;
public class WeatherData {
    
    private ArrayList<Double> temperatures;

    public void cleanData(double lower, double upper) {
        for (double temp : temperatures) {
            if (temp <= lower || temp >= upper) { 
                temperatures.remove(temp); 
            }
        }
    }

    public int longestHeatWave(double threshhold) {
        return 0;
    }

}