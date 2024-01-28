package adapters;

import round.RoundPeg;
import square.SquarePeg;

// Adaptador de pinos quadrados para buracos redondos
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calcula o tamanho minimo do buraco para caber o pino
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }

}
