package fabrica.components;

public class GPSNavigator {

    private String route;

    public GPSNavigator() {
        this.route = "Rua Professor Arduino Bolivar 150";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }

}
