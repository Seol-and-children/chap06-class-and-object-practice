package kr.ac.sahmyook;

public class Chef {
    Bread bread = new Bread();
    public void turnOn() {
        bread.startCooking();
    }

    public void setTemperature() {
        bread.setTemperature();
    }

    public void upTemperature() {
        bread.upTemperature();
    }

    public void staying() {
        bread.staying();
    }

    public void downTemperature() {
        bread.downTemperature();
    }

    public void turnOff() {
        bread.stopCooking();
    }
}
