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
                i--;
            }
        }
    }

    public int longestHeatWave(double threshhold) {
        int heatWave  = 0;
        int max = 0;
        for (double t : temperatures) {
            if (t > threshhold) heatWave++;
            else heatWave = 0;
            if (heatWave > max) max = heatWave;
        }
        return max;
    }

    public String toString() {
        return temperatures.toString();
    }

}