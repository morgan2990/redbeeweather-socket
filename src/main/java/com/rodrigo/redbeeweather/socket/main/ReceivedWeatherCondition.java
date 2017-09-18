package com.rodrigo.redbeeweather.socket.main;

public class ReceivedWeatherCondition {

    private String receivedWeatherCondition;

    public ReceivedWeatherCondition(String receivedWeatherCondition) {
        this.receivedWeatherCondition = receivedWeatherCondition;
    }

    public String getReceivedWeatherCondition() {
        return receivedWeatherCondition;
    }

    public void setReceivedWeatherCondition(String receivedWeatherCondition) {
        this.receivedWeatherCondition = receivedWeatherCondition;
    }
}
