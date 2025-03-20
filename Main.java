import java.util.ArrayList;
public class Main {
    public static void main (String args[]) {

        double[] temps = {
            99.1, 142, 85, 86.1, 84.6,
            94.3, 124.9, 98, 101.0, 102.5
        };
        ArrayList<Double> temperatures = new ArrayList<Double>();
        for(double n : temps) temperatures.add(n);
        WeatherData w = new WeatherData(temperatures);
        w.cleanData(85.0, 120); 
        System.out.print(w);
        temperatures.add(1, 121.0);
        System.out.println(w);
        temperatures.add(1, 84.0);
        System.out.println(w); 
        

    } 
}