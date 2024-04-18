package day08.final_.practice;

public class WeatherAnalyzer {

    public static boolean checkTemperatureAlert(double temperature) {
        return temperature > WeatherConstants.MAX_TEMPERATURE_ALERT.getNumericData() || temperature < WeatherConstants.MIN_TEMPERATURE_ALERT.getNumericData();
    }

    public static boolean checkPrecipitationAlert(double precipitation) {
        return precipitation > WeatherConstants.PRECIPITATION_ALERT.getNumericData();
    }
}
