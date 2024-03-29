package fabrica.components;

import fabrica.cars.Car;

public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Nivel de combustivel: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Carro ligado");
        } else {
            System.out.println("Carro desligado");
        }
    }

}
