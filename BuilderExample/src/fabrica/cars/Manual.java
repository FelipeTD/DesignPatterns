package fabrica.cars;

import fabrica.components.Engine;
import fabrica.components.GPSNavigator;
import fabrica.components.Transmission;
import fabrica.components.TripComputer;

public class Manual {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Tipo de carro: " + carType + "\n";
        info += "Numero de assentos: " + seats + "\n";
        info += "Motor: volume - " + engine.getVolume() + "; Quilometragem - " + engine.getMileage() + "\n";
        info += "Trasmissao: " + transmission + "\n";

        if (this.tripComputer != null) {
            info += "Computador de bordo funcionando" + "\n";
        } else {
            info += "Sem computador de bordo" + "\n";
        }

        if (this.gpsNavigator != null) {
            info += "GPS funcionando" + "\n";
        } else {
            info += "Sem GPS" + "\n";
        }

        return info;
    }

}
