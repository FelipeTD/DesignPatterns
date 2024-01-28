package fabrica;

import fabrica.builders.CarBuilder;
import fabrica.builders.CarManualBuilder;
import fabrica.cars.Car;
import fabrica.cars.Manual;
import fabrica.director.Director;

public class FabricaMain {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Carro construido: \n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("Manual do carro \n" + carManual.print());
    }

}
