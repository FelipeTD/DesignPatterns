package fabrica.builders;

import fabrica.cars.CarType;
import fabrica.components.Engine;
import fabrica.components.GPSNavigator;
import fabrica.components.Transmission;
import fabrica.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
