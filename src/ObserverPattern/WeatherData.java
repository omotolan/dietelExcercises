package ObserverPattern;

public class WeatherData {
    CurrentConditionDisplay currentConditionDisplay;
    ForecastDisplay forecastDisplay;
    StatisticsDisplay statisticsDisplay;
    public double getTemperature(){
return 0.0;
    }
    public double getHumidity(){
        return 0.0;
    }
    public double getPressure(){
        return 0.0;
    }

    public void measurementsChanged(){
        double temperature = getTemperature();
        double humidity = getHumidity();
        double pressure = getPressure();
        currentConditionDisplay.display(temperature,pressure ,humidity );
        forecastDisplay.display(temperature,pressure ,humidity );
        statisticsDisplay.display(temperature,pressure ,humidity );
    }
}
