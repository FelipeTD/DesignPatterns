import adapters.SquarePegAdapter;
import connections.MySQLAdapter;
import connections.MySQLCommands;
import connections.OracleCommands;
import round.RoundHole;
import round.RoundPeg;
import square.SquarePeg;

public class AdpterMain {

    public static void main(String[] args) {

        OracleCommands oracle = new OracleCommands();
        oracle.insert();
        oracle.update();
        oracle.delete();

        System.out.println();
        MySQLAdapter mySQL = new MySQLAdapter(new MySQLCommands());
        mySQL.insert();
        mySQL.update();
        mySQL.delete();
        System.out.println();

        System.out.println("Testando a lógica dos pinos");

        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(5);
        if (hole.fits(peg)) {
            System.out.println("Round peg r5 fits round hole r5");
        }

        SquarePeg smallPeg = new SquarePeg(2);
        SquarePeg largePeg = new SquarePeg(20);
        // Não funciona porque ele precisa de um RoundPeg não um SquarePeg
        // hole.fits(smallPeg);

        // O Adaptador resolve o problema
        SquarePegAdapter smallPegAdapter = new SquarePegAdapter(smallPeg);
        SquarePegAdapter largePegAdapter = new SquarePegAdapter(largePeg);

        if (hole.fits(smallPegAdapter)) {
            System.out.println("Square peg width 2 fits round hole r5");
        }

        if (!hole.fits(largePegAdapter)) {
            System.out.println("Square peg width 20 does not fit into round hole r5");
        }

    }

}