import java.util.ArrayList;
public class WeatherData {
    
    private ArrayList<Double> temperatures;

    public WeatherData(ArrayList<Double> t) {
        temperatures = t;
    }
    public void cleanData(double lower, double upper) {
        for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) <= lower || temperatures.get(i) >= upper) { 
                temperatures.remove(i); 
            }
        }
    }

    public int longestHeatWave(double threshhold) {
        return 0;
    }

    public String toString() {
        return temperatures.toString();
    }

}