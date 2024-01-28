package connections;

public class OracleCommands implements DbAdpter {

    @Override
    public void insert() {
        System.out.println("Insert from oracle");
    }

    @Override
    public void update() {
        System.out.println("Update from oracle");
    }

    @Override
    public void delete() {
        System.out.println("Delete from oracle");
    }
}
