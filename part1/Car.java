package part1;

public class Car {
    static void start(){

        Car.startElectricity();
        Car.startCommand();
        Car.startFuelSystem();
    }

    protected void startElectricity(){};
    protected void startCommand() {};
    protected void startFuelSystem() {};

}
